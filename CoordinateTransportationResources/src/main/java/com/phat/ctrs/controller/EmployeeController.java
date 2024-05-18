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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.phat.ctrs.model.CurrentDebt;
import com.phat.ctrs.model.EmployeeShift;
import com.phat.ctrs.model.EmployeeSkill;
import com.phat.ctrs.model.LimitDebt;
import com.phat.ctrs.model.Skill;
import com.phat.ctrs.repository.IEmployeeShiftRepository;
import com.phat.ctrs.repository.IEmployeeSkillRepository;
import com.phat.ctrs.repository.ISkillRepository;
import com.phat.ctrs.service.IEmployeeService;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    IEmployeeShiftRepository employeeShiftRepository;
    @Autowired
    IEmployeeSkillRepository employeeSkillRepository;
    @Autowired
    ISkillRepository skillRepository;

    @GetMapping("/shift")
    private ResponseEntity<List<EmployeeShift>> getAllEmployee() {
        return new ResponseEntity<List<EmployeeShift>>(employeeShiftRepository.getAllEmployeeShift(), HttpStatus.OK);
    }

    @GetMapping("/skillList")
    private ResponseEntity<List<Skill>> getAllSkill() {
        return new ResponseEntity<List<Skill>>(skillRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/skill/{id}")
    @ResponseBody
    private ResponseEntity<List<EmployeeSkill>> getEmployeeSkill(@PathVariable BigDecimal id) {
        return new ResponseEntity<List<EmployeeSkill>>(employeeSkillRepository.getAllEmployeeSkillBySkillId(id),
                HttpStatus.OK);
    }

    @GetMapping("/currentDebt")
    private ResponseEntity<List<CurrentDebt>> getCurentDebt() {
        return new ResponseEntity<List<CurrentDebt>>(employeeService.getAllCurrentDebt(), HttpStatus.OK);
    }

    @GetMapping("/limitDebt")
    private ResponseEntity<List<LimitDebt>> getLimitDebt() {
        return new ResponseEntity<List<LimitDebt>>(employeeService.getAllLimitDebt(), HttpStatus.OK);
    }
}
