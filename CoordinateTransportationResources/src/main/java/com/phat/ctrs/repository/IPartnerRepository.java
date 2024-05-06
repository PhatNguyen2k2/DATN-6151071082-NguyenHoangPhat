package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.Partner;

public interface IPartnerRepository extends JpaRepository<Partner, BigDecimal> {
    @Query(value = "select p.* from partner p, vehicle_agreement v, service_price s where p.partner_id = v.partner_id and v.vehicle_agreement_id = s.vehicle_agreement_id and s.vehicle_type_id = ?1", nativeQuery = true)
    public List<Partner> getPartnerByVehicleType(BigDecimal vehicleType);

    @Query(value = "select f.cost from vehicle_agreement v, service_price s, feeonkilometers f where v.vehicle_agreement_id = s.vehicle_agreement_id and s.service_price_id = f.service_price_id and v.partner_id = ?1 and s.vehicle_type_id = ?2", nativeQuery = true)
    public BigDecimal getFeeOnKmOfPartnerByVehicleType(BigDecimal partnerId, BigDecimal vehicleTypeId);
}
