package com.phat.ctrs.service;

import java.util.HashMap;
import java.util.List;

import com.phat.ctrs.model.Route;

public interface IRouteService {
	public List<Route> getAllRoute();

	public List<List<Route>> getRouteByVehicleType();

	public List<HashMap<Integer, List<Integer>>> calculateCost(List<List<Route>> routeList);
}
