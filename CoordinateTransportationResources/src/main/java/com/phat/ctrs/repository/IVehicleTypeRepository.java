package com.phat.ctrs.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phat.ctrs.model.Vehicletype;

public interface IVehicleTypeRepository extends JpaRepository<Vehicletype, BigDecimal> {
}
