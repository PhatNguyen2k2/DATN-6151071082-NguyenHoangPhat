package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.CurrentDebt;

public interface ICurrentDebtRepository extends JpaRepository<CurrentDebt, BigDecimal> {
    @Query(value = "select * from current_debt order by employee_id", nativeQuery = true)
    public List<CurrentDebt> getAllCurrentDebt();
}
