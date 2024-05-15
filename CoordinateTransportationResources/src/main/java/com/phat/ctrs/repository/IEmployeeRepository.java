package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, BigDecimal> {
    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    public List<Employee> getAllEmployee();
}
