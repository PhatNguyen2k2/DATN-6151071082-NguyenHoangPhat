package com.phat.ctrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phat.ctrs.model.Partner;
import com.phat.ctrs.model.VehicleAgreement;
import com.phat.ctrs.repository.IPartnerRepository;
import com.phat.ctrs.repository.IVehicleAgreementRepository;
import com.phat.ctrs.service.IPartnerService;

@RestController
@RequestMapping("/api/partner")
@CrossOrigin("*")
public class PartnerController {
    @Autowired
    IPartnerService partnerService;
    @Autowired
    IPartnerRepository partnerRepository;
    @Autowired
    IVehicleAgreementRepository agreementRepository;

    @GetMapping("")
    private ResponseEntity<List<Partner>> getAllPartner() {
        return new ResponseEntity<List<Partner>>(partnerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/agreement")
    private ResponseEntity<List<VehicleAgreement>> getVehicleAgreement() {
        return new ResponseEntity<List<VehicleAgreement>>(agreementRepository.findAll(), HttpStatus.OK);
    }
}
