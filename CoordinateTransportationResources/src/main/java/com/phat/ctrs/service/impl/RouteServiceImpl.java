package com.phat.ctrs.service.impl;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.phat.ctrs.model.Partner;
import com.phat.ctrs.model.Route;
import com.phat.ctrs.model.VehicleLoadType;
import com.phat.ctrs.repository.IRouteRepository;
import com.phat.ctrs.service.IPartnerService;
import com.phat.ctrs.service.IRouteService;
import com.phat.ctrs.service.ITransportServicePlanService;
import com.phat.ctrs.utils.OrToolForBookingPartner;
import com.phat.ctrs.utils.OrToolsHelper;

@Service
@EnableCaching
public class RouteServiceImpl implements IRouteService {
	@Autowired
	IRouteRepository routeRepository;
	@Autowired
	IPartnerService partnerService;
	@Autowired
	ITransportServicePlanService planService;

	@Override
	public List<Route> getAllRoute() {
		return routeRepository.findAll();
	}

	public List<List<Route>> getRouteByVehicleType() {
		List<Route> routes = getAllRoute();
		Map<BigDecimal, List<Route>> routeMap = new HashMap<>();
		for (Route route : routes) {
			BigDecimal vehicleTypeId = route.getVehicleType().getVehicleTypeId();
			routeMap.computeIfAbsent(vehicleTypeId, k -> new ArrayList<>()).add(route);
		}
		return new ArrayList<>(routeMap.values());
	}

	@Override
	public void calculateCost() {
		getRouteByVehicleType().parallelStream()
				.forEach(route -> {
					BigDecimal vehicleTypeId = route.get(0).getVehicleType().getVehicleTypeId();
					List<Partner> partnerList = partnerService.getPartnersByVehicleType(vehicleTypeId);
					List<Integer> routeLength = route.stream().mapToInt(t -> t.getRouteLength().intValue()).boxed()
							.collect(Collectors.toList());

					List<Integer> costPartner = partnerList.stream()
							.map(t -> partnerService.getFeeOnKmOfPartnerByVehicleType(t.getPartnerId(),
									vehicleTypeId)
									.intValue())
							.collect(Collectors.toList());

					List<Integer> provideAbility = partnerList.stream()
							.map(t -> partnerService.getResourceOfPartner(t.getPartnerId(),
									vehicleTypeId)
									.intValue())
							.collect(Collectors.toList());

					List<VehicleLoadType> vehicleLoadTypes = partnerList.stream()
							.map(t -> partnerService.getVehicleLoadTypesByPartnerId(t.getPartnerId(),
									vehicleTypeId))
							.collect(Collectors.toList());

					List<List<LocalTime[]>> serveTime = vehicleLoadTypes.stream()
							.map(t -> OrToolsHelper.calculateOuTimes(
									new LocalTime[] { t.getShift().getTimeStart(), t.getShift().getTimeEnd() }))
							.collect(Collectors.toList());

					int[][] costs = OrToolsHelper.buildCostMatrix(routeLength, costPartner);
					int[] totalSizeMax = OrToolsHelper.buildProvideAbility(provideAbility);
					int[][] times = OrToolsHelper.buildShiftOfRoute(route);
					int[][][] shiftTimes = OrToolsHelper.buildServeTimeOfPartner(serveTime);

					HashMap<Integer, List<Integer>> rs = OrToolForBookingPartner.or(costs, times, shiftTimes,
							totalSizeMax);
					Set<Integer> keys = rs.keySet();
					for (int key : keys) {
						Partner pn = partnerList.get(key);
						List<Integer> routeRs = rs.get(key);
						for (int _route : routeRs) {
							Route r = route.get(_route);
							planService.updatePartnerForRoute(pn.getPartnerId(), r.getRouteId());
						}
					}
				});
	}

	@Override
	public void calculateDebt() {
		List<Route> routes = this.getAllRoute();
		routes.forEach(r -> {

		});
	}
}
