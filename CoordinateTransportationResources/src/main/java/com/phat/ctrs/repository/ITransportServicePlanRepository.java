package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.phat.ctrs.model.TransportServicePlan;

@Transactional
public interface ITransportServicePlanRepository extends JpaRepository<TransportServicePlan, BigDecimal> {
    @Query(value = "select * from transport_service_plan", nativeQuery = true)
    public List<TransportServicePlan> getAll();

    @Modifying
    @Query(value = "update transport_service_plan set partner_id = ?1 where route_id = ?2", nativeQuery = true)
    public int updatePartnerForRoute(BigDecimal partnerId, BigDecimal routeId);

    @Modifying
    @Query(value = "update transport_service_plan set cost_partner = ?1 where route_id = ?2", nativeQuery = true)
    public int updateCostForRoute(BigDecimal costPartner, BigDecimal routeId);

    @Modifying
    @Query(value = "update transport_service_plan set employee_id = ?1 where route_id = ?2", nativeQuery = true)
    public int updateEmployeeForRoute(BigDecimal employeeId, BigDecimal routeId);

    @Query(value = "select * from transport_service_plan where partner_id = ?1", nativeQuery = true)
    public List<TransportServicePlan> getInternalServicePlan(BigDecimal partner_id);

    @Modifying
    @Query(value = "update transport_service_plan set vehicle_info = ?1 where transport_service_plan_id = ?2", nativeQuery = true)
    public int updateVehicleForRoute(String vehicleInfo, BigDecimal transportServicePlanId);

    @Modifying
    @Query(value = "update transport_service_plan set partner_id = null, cost_partner = null, employee_id = null, vehicle_info = null", nativeQuery = true)
    public void resetPlan();
}
