package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, BigDecimal> {
    @Query(value = "SELECT * FROM employee order by employee_id", nativeQuery = true)
    public List<Employee> getAllEmployee();

    @Query(value = "SELECT * FROM employee where partner_id = ?1 order by employee_id", nativeQuery = true)
    public List<Employee> getDriverByPartner(BigDecimal partnerId);
}
