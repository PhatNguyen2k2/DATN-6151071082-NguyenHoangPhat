package com.phat.ctrs.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.phat.ctrs.model.Partner;
import com.phat.ctrs.model.Route;
import com.phat.ctrs.repository.IRouteRepository;
import com.phat.ctrs.service.IPartnerService;
import com.phat.ctrs.service.IRouteService;
import com.phat.ctrs.utils.OrToolForBooking;
import com.phat.ctrs.utils.OrToolsHelper;

@Service
@EnableCaching
public class RouteServiceImpl implements IRouteService {
	@Autowired
	IRouteRepository routeRepository;
	@Autowired
	IPartnerService partnerService;

	@Override
	public List<Route> getAllRoute() {
		return routeRepository.findAll();
	}

	@Override
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
	public String calculateCost(List<List<Route>> routeList) {
		routeList.forEach(route -> {
			BigDecimal vehicleTypeId = route.get(0).getVehicleType().getVehicleTypeId();
			List<Partner> partnerList = partnerService.getPartnersByVehicleType(vehicleTypeId);
			List<Integer> routeLength = new ArrayList<Integer>();
			List<Integer> costPartner = new ArrayList<Integer>();
			route.forEach(t -> routeLength.add(Integer.valueOf(t.getRouteLength().intValue())));
			partnerList.forEach(t -> costPartner.add(Integer.valueOf(
					partnerService.getFeeOnKmOfPartnerByVehicleType(t.getPartnerId(), vehicleTypeId).intValue())));
			int costs[][] = OrToolsHelper.buildCostMatrix(routeLength, costPartner);
			HashMap<Integer, List<Integer>> rs = OrToolForBooking.or(costs);
			// routeList
			// partnerList
			Set<Integer> keys = rs.keySet();
			for (int key : keys) {
				Partner pn = partnerList.get(key);
				List<Integer> routeRs = rs.get(key);
				for (int _route : routeRs) {
					Route r = route.get(_route);
					System.out.println(pn.getPartnerName() + " : " + r.getRouteId());
				}
			}
			System.out.println(rs);
		});
		return "";
	}
}
