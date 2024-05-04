package com.phat.ctrs.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.phat.ctrs.model.Route;
import com.phat.ctrs.repository.IRouteRepository;
import com.phat.ctrs.service.IRouteService;

@Service
@EnableCaching
public class RouteServiceImpl implements IRouteService {
	@Autowired
	IRouteRepository routeRepository;

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

}
