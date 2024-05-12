package com.phat.ctrs.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phat.ctrs.model.Feeonkilometers;
import com.phat.ctrs.repository.IFeeOnKilometerRepository;
import com.phat.ctrs.service.IFeeOnKilometerService;

@Service
public class FeeOnKilometerServiceImpl implements IFeeOnKilometerService {
    @Autowired
    IFeeOnKilometerRepository feeOnKilometerRepository;

    @Override
    public List<Feeonkilometers> getFeeOnKilometerByVehicleTypeId(BigDecimal vehicleTypeId) {
        return feeOnKilometerRepository.getFeeOnKilometerByVehicleTypeId(vehicleTypeId);
    }

}
