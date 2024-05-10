package com.phat.ctrs.service;

import java.util.List;

import com.phat.ctrs.model.Route;

public interface IRouteService {
	public List<Route> getAllRoute();

	public void calculateCost();
}
