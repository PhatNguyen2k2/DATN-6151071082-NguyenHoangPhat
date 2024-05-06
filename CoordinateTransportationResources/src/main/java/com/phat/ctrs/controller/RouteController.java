package com.phat.ctrs.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.phat.ctrs.model.Partner;
import com.phat.ctrs.model.Route;
import com.phat.ctrs.service.IPartnerService;
import com.phat.ctrs.service.IRouteService;

@RestController
@RequestMapping("/api/route")
@CrossOrigin("*")
public class RouteController {
	@Autowired
	IRouteService routeService;
	@Autowired
	IPartnerService partnerService;

	@GetMapping("")
	private ResponseEntity<List<Route>> getAllRoute() {
		return new ResponseEntity<List<Route>>(routeService.getAllRoute(), HttpStatus.OK);
	}

	@GetMapping("/type")
	private ResponseEntity<List<List<Route>>> getRouteByVehicleType() {
		routeService.calculateCost(routeService.getRouteByVehicleType());
		return new ResponseEntity<List<List<Route>>>(routeService.getRouteByVehicleType(),
				HttpStatus.OK);
	}

	@GetMapping("/partner")
	@ResponseBody
	private ResponseEntity<List<Partner>> getPartnerByVehicleType(@RequestParam String id) {
		return new ResponseEntity<List<Partner>>(
				partnerService.getPartnersByVehicleType(BigDecimal.valueOf(Integer.valueOf(id))), HttpStatus.OK);
	}
}
