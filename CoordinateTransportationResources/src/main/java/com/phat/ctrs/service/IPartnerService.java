package com.phat.ctrs.service;

import java.math.BigDecimal;
import java.util.List;

import com.phat.ctrs.model.Partner;
import com.phat.ctrs.model.VehicleLoadType;

public interface IPartnerService {
    public List<Partner> getPartnersByVehicleType(BigDecimal vehicleType);

    public BigDecimal getFeeOnKmOfPartnerByVehicleType(BigDecimal partnerId, BigDecimal vehicleTypeId);

    public VehicleLoadType getVehicleLoadTypesByPartnerId(BigDecimal partnerId, BigDecimal vehicleTypeId);

    public BigDecimal getResourceOfPartner(BigDecimal partnerId, BigDecimal vehicleTypeId);
}
