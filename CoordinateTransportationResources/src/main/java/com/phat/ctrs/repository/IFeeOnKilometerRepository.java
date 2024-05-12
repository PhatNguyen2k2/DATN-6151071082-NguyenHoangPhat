package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.Feeonkilometers;

public interface IFeeOnKilometerRepository extends JpaRepository<Feeonkilometers, BigDecimal> {
    @Query(value = "select f.* from service_price s, feeonkilometers f where s.service_price_id = f.service_price_id and s.vehicle_type_id = ?1", nativeQuery = true)
    public List<Feeonkilometers> getFeeOnKilometerByVehicleTypeId(BigDecimal vehicleTypeId);
}
