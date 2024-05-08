package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.VehicleLoadType;

public interface IVehicleLoadTypeRepository extends JpaRepository<VehicleLoadType, BigDecimal> {
    @Query(value = "select * from vehicle_load_type where partner_id = ?1", nativeQuery = true)
    public List<VehicleLoadType> getVehicleLoadTypesByPartnerId(BigDecimal partnerId);
}
