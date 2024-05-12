package com.phat.ctrs.service;

import java.math.BigDecimal;
import java.util.List;

import com.phat.ctrs.model.Feeonkilometers;

public interface IFeeOnKilometerService {
    public List<Feeonkilometers> getFeeOnKilometerByVehicleTypeId(BigDecimal vehicleTypeId);
}
