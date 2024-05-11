package com.phat.ctrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phat.ctrs.model.Route;
import com.phat.ctrs.model.TransportServicePlan;
import com.phat.ctrs.service.IPartnerService;
import com.phat.ctrs.service.IRouteService;
import com.phat.ctrs.service.ITransportServicePlanService;

@RestController
@RequestMapping("/api/route")
@CrossOrigin("*")
public class RouteController {
	@Autowired
	IRouteService routeService;
	@Autowired
	IPartnerService partnerService;
	@Autowired
	ITransportServicePlanService planService;

	@GetMapping("")
	private ResponseEntity<List<Route>> getAllRoute() {
		return new ResponseEntity<List<Route>>(routeService.getAllRoute(), HttpStatus.OK);
	}

	@GetMapping("/choosePartner")
	private ResponseEntity<List<TransportServicePlan>> getAllTranportServicePlan() {
		routeService.calculateCost();
		planService.updateCost();
		return new ResponseEntity<List<TransportServicePlan>>(planService.getAll(),
				HttpStatus.OK);
	}
}
