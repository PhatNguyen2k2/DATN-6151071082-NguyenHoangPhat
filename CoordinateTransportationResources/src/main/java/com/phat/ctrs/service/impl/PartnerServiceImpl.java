package com.phat.ctrs.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.phat.ctrs.model.Partner;
import com.phat.ctrs.model.VehicleLoadType;
import com.phat.ctrs.repository.IPartnerRepository;
import com.phat.ctrs.repository.IVehicleLoadTypeRepository;
import com.phat.ctrs.service.IPartnerService;

@Service
@EnableCaching
public class PartnerServiceImpl implements IPartnerService {

    @Autowired
    IPartnerRepository partnerRepository;
    @Autowired
    IVehicleLoadTypeRepository vehicleLoadTypeRepository;

    @Override
    public List<Partner> getPartnersByVehicleType(BigDecimal vehicleType) {
        return partnerRepository.getPartnerByVehicleType(vehicleType);
    }

    @Override
    public BigDecimal getFeeOnKmOfPartnerByVehicleType(BigDecimal partnerId, BigDecimal vehicleTypeId) {
        return partnerRepository.getFeeOnKmOfPartnerByVehicleType(partnerId, vehicleTypeId);
    }

    @Override
    public List<VehicleLoadType> getVehicleLoadTypesByPartnerId(BigDecimal partnerId) {
        return vehicleLoadTypeRepository.getVehicleLoadTypesByPartnerId(partnerId);
    }

}
