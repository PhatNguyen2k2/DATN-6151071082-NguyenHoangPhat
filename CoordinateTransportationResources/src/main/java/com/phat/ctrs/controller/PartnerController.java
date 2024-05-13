package com.phat.ctrs.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.phat.ctrs.model.Feeonkilometers;
import com.phat.ctrs.model.Partner;
import com.phat.ctrs.model.TransportResource;
import com.phat.ctrs.model.VehicleAgreement;
import com.phat.ctrs.model.VehicleLoadType;
import com.phat.ctrs.repository.IPartnerRepository;
import com.phat.ctrs.repository.ITransportResourceRepository;
import com.phat.ctrs.repository.IVehicleAgreementRepository;
import com.phat.ctrs.service.IPartnerService;
import com.phat.ctrs.service.IFeeOnKilometerService;

@RestController
@RequestMapping("/api/partner")
@CrossOrigin("*")
public class PartnerController {
    @Autowired
    IPartnerService partnerService;
    @Autowired
    IPartnerRepository partnerRepository;
    @Autowired
    ITransportResourceRepository resourceRepository;
    @Autowired
    IVehicleAgreementRepository agreementRepository;
    @Autowired
    IFeeOnKilometerService feeOnKilometerService;

    @GetMapping("")
    private ResponseEntity<List<Partner>> getAllPartner() {
        return new ResponseEntity<List<Partner>>(partnerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/resource")
    private ResponseEntity<List<TransportResource>> getVehicleResource() {
        return new ResponseEntity<List<TransportResource>>(resourceRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/agreement")
    private ResponseEntity<List<VehicleAgreement>> getVehicleAgreement() {
        return new ResponseEntity<List<VehicleAgreement>>(agreementRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/servicePrice/{id}")
    @ResponseBody
    private ResponseEntity<List<Feeonkilometers>> getServicePriceOfPartner(@PathVariable BigDecimal id) {
        return new ResponseEntity<List<Feeonkilometers>>(feeOnKilometerService.getFeeOnKilometerByVehicleTypeId(id),
                HttpStatus.OK);
    }

    @GetMapping("/vehicleLoadType")
    @ResponseBody
    private ResponseEntity<VehicleLoadType> getVehicleLoadTypesByPartnerId(
            @RequestParam("partner") String partnerId,
            @RequestParam("vehicleType") String vehicleTypeId) {
        return new ResponseEntity<VehicleLoadType>(
                partnerService.getVehicleLoadTypesByPartnerId(BigDecimal.valueOf(Integer.parseInt(partnerId)),
                        BigDecimal.valueOf(Integer.parseInt(vehicleTypeId))),
                HttpStatus.OK);
    }
}
