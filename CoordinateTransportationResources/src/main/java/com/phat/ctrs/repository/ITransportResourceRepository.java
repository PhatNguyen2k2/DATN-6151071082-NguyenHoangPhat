package com.phat.ctrs.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.TransportResource;

public interface ITransportResourceRepository extends JpaRepository<TransportResource, BigDecimal> {
    @Query(value = "select t.num_of_vehicle_can_provide_in_day from transport_resource t, vehicle_agreement v where t.vehicle_agreement_id = v.vehicle_agreement_id and v.partner_id = ?1 and t.vehicle_type_id = ?2", nativeQuery = true)
    public BigDecimal getResourceOfPartner(BigDecimal partnerId, BigDecimal vehicleTypeId);
}
