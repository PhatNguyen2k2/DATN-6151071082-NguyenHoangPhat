package com.phat.ctrs.service;

import java.math.BigDecimal;
import java.util.List;

import com.phat.ctrs.model.TransportServicePlan;

public interface ITransportServicePlanService {
	public List<TransportServicePlan> getAll();

	public int updatePartnerForRoute(BigDecimal partnerId, BigDecimal routeId);

	public int updateCostForRoute(BigDecimal costPartner, BigDecimal routeId);

	public int updateEmployeeForRoute(BigDecimal employeeId, BigDecimal routeId);

	public void updateCost();
}
