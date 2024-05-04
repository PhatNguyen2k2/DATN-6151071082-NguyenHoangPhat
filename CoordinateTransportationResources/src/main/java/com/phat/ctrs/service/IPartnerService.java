package com.phat.ctrs.service;

import java.math.BigDecimal;
import java.util.List;

import com.phat.ctrs.model.Partner;

public interface IPartnerService {
    public List<Partner> getPartnersByVehicleType(BigDecimal vehicleType);
}
