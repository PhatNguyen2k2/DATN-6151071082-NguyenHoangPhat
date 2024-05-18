package com.phat.ctrs.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.phat.ctrs.model.TransportServicePlan;
import com.phat.ctrs.repository.IPartnerRepository;
import com.phat.ctrs.repository.ITransportServicePlanRepository;
import com.phat.ctrs.service.ITransportServicePlanService;

@Service
@EnableCaching
public class TransportServicePlanServiceImpl implements ITransportServicePlanService {
    @Autowired
    ITransportServicePlanRepository planRepository;
    @Autowired
    IPartnerRepository partnerRepository;

    @Override
    public int updatePartnerForRoute(BigDecimal partnerId, BigDecimal routeId) {
        return planRepository.updatePartnerForRoute(partnerId, routeId);
    }

    @Override
    public List<TransportServicePlan> getAll() {
        return planRepository.getAll();
    }

    @Override
    public int updateCostForRoute(BigDecimal costPartner, BigDecimal routeId) {
        return planRepository.updateCostForRoute(costPartner, routeId);
    }

    @Override
    public void updateCost() {
        List<TransportServicePlan> plans = this.getAll();
        plans.forEach(t -> {
            BigDecimal cost = partnerRepository.getcostOfPartner(t.getPartner().getPartnerId(),
                    t.getRoute().getRouteId());
            this.updateCostForRoute(cost, t.getRoute().getRouteId());
        });
    }

    @Override
    public int updateEmployeeForRoute(BigDecimal employeeId, BigDecimal routeId) {
        return planRepository.updateEmployeeForRoute(employeeId, routeId);
    }

    @Override
    public List<TransportServicePlan> getInternalServicePlan() {
        return planRepository.getInternalServicePlan();
    }

    @Override
    public void resetPlan() {
        planRepository.resetPlan();
    }

    @Override
    public int updateVehicleForRoute(String vehicleInfo, BigDecimal transportServicePlanId) {
        return planRepository.updateVehicleForRoute(vehicleInfo, transportServicePlanId);
    }
}
