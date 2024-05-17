package com.phat.ctrs.service;

import java.math.BigDecimal;
import java.util.List;

import com.phat.ctrs.model.CurrentDebt;
import com.phat.ctrs.model.Employee;
import com.phat.ctrs.model.EmployeeTransportService;
import com.phat.ctrs.model.LimitDebt;

public interface IEmployeeService {
    public List<Employee> getAllEmployee();

    public List<CurrentDebt> getAllCurrentDebt();

    public List<LimitDebt> getAllLimitDebt();

    public List<EmployeeTransportService> getAllEmployeeTransportService();

    public void deleteEmployeeTransportService();

    public void insertEmployeeTransportService(BigDecimal routeId, BigDecimal employeeId);
}
