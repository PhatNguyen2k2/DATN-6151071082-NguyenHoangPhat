package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.EmployeeSkill;

public interface IEmployeeSkillRepository extends JpaRepository<EmployeeSkill, BigDecimal> {
    @Query(value = "SELECT * FROM employee_skill order by employee_id", nativeQuery = true)
    public List<EmployeeSkill> getAllEmployeeSkill();
}
