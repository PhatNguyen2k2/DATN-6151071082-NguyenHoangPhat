package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.EmployeeShift;

public interface IEmployeeShiftRepository extends JpaRepository<EmployeeShift, BigDecimal> {
    @Query(value = "SELECT * FROM employee_shift", nativeQuery = true)
    public List<EmployeeShift> getAllEmployeeShift();
}
