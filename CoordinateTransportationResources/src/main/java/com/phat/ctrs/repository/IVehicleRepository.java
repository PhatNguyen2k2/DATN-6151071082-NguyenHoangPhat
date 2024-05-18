package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.Vehicle;

public interface IVehicleRepository extends JpaRepository<Vehicle, BigDecimal> {
    @Query(value = "SELECT * FROM vehicle WHERE vehicle_type_id = ?1", nativeQuery = true)
    public List<Vehicle> getVehicleByVehicleType(BigDecimal vehicleTypeId);
}
