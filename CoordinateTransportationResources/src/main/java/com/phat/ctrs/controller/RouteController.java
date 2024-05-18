package com.phat.ctrs.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.phat.ctrs.model.TransportServicePlan;
import com.phat.ctrs.model.Vehicle;
import com.phat.ctrs.model.Route;
import com.phat.ctrs.model.Shift;
import com.phat.ctrs.model.Vehicletype;
import com.phat.ctrs.repository.IShiftRespository;
import com.phat.ctrs.repository.IVehicleRepository;
import com.phat.ctrs.repository.IVehicleTypeRepository;
import com.phat.ctrs.service.IEmployeeService;
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
	@Autowired
	IVehicleTypeRepository typeRepository;
	@Autowired
	IShiftRespository shiftRespository;
	@Autowired
	IEmployeeService employeeService;

	@GetMapping("")
	private ResponseEntity<List<Route>> getAllRoute() {
		return new ResponseEntity<List<Route>>(routeService.getAllRoute(), HttpStatus.OK);
	}

	@GetMapping("/shift")
	private ResponseEntity<List<Shift>> getAllShift() {
		return new ResponseEntity<List<Shift>>(shiftRespository.getAllShift(), HttpStatus.OK);
	}

	@GetMapping("/vehicleType")
	private ResponseEntity<List<Vehicletype>> getAllVehicleType() {
		return new ResponseEntity<List<Vehicletype>>(typeRepository.findAll(), HttpStatus.OK);
	}

	@GetMapping("/vehicle/{id}")
	@ResponseBody
	private ResponseEntity<List<Vehicle>> getAllVehicle(@PathVariable BigDecimal id) {
		return new ResponseEntity<List<Vehicle>>(partnerService.getVehicleByVehicleType(id), HttpStatus.OK);
	}

	@GetMapping("/servicePlan")
	private ResponseEntity<List<TransportServicePlan>> getAllTranportServicePlan() {
		return new ResponseEntity<List<TransportServicePlan>>(planService.getAll(),
				HttpStatus.OK);
	}

	@GetMapping("/choosePartner")
	private ResponseEntity<List<TransportServicePlan>> getAllPartnerServicePlan() {
		routeService.calculateCost();
		planService.updateCost();
		return new ResponseEntity<List<TransportServicePlan>>(planService.getAll(),
				HttpStatus.OK);
	}

	@GetMapping("/chooseEmployee")
	private ResponseEntity<List<TransportServicePlan>> getAllEmployeeTransportService() {
		routeService.calculateDebt();
		return new ResponseEntity<List<TransportServicePlan>>(planService.getAll(),
				HttpStatus.OK);
	}
}
