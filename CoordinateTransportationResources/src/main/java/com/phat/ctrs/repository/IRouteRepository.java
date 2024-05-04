package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.Route;

public interface IRouteRepository extends JpaRepository<Route, BigDecimal> {
    @Query(value = "select vehicle_type_id from route group by vehicle_type_id", nativeQuery = true)
    public List<BigDecimal> getVehicleTypeIdFromRoute();
}
