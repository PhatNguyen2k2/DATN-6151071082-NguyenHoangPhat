package com.phat.ctrs.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phat.ctrs.model.CurrentDebt;
import com.phat.ctrs.model.Employee;
import com.phat.ctrs.model.EmployeeTransportService;
import com.phat.ctrs.model.LimitDebt;
import com.phat.ctrs.repository.ICurrentDebtRepository;
import com.phat.ctrs.repository.IEmployeeRepository;
import com.phat.ctrs.repository.IEmployeeTransportServiceRepository;
import com.phat.ctrs.repository.ILimitDebtRepository;
import com.phat.ctrs.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository;
    @Autowired
    ICurrentDebtRepository currentDebtRepository;
    @Autowired
    ILimitDebtRepository limitDebtRepository;
    @Autowired
    IEmployeeTransportServiceRepository employeeTransportServiceRepository;

    @Override
    public List<CurrentDebt> getAllCurrentDebt() {
        return currentDebtRepository.getAllCurrentDebt();
    }

    @Override
    public List<LimitDebt> getAllLimitDebt() {
        return limitDebtRepository.getAllLimitDebt();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    @Override
    public void deleteEmployeeTransportService() {
        employeeTransportServiceRepository.deleteEmployeeTransportService();
    }

    @Override
    public void insertEmployeeTransportService(BigDecimal routeId, BigDecimal employeeId) {
        employeeTransportServiceRepository.insertEmployeeTransportService(routeId, employeeId);
    }

    @Override
    public List<EmployeeTransportService> getAllEmployeeTransportService() {
        return employeeTransportServiceRepository.findAll();
    }

    @Override
    public List<Employee> getDriverByPartner() {
        BigDecimal partnerId = BigDecimal.valueOf(7);
        return employeeRepository.getDriverByPartner(partnerId);
    }
}