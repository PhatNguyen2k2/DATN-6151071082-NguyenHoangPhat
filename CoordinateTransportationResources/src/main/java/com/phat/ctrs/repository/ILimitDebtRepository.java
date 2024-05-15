package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.LimitDebt;

public interface ILimitDebtRepository extends JpaRepository<LimitDebt, BigDecimal> {
    @Query(value = "select * from limit_debt", nativeQuery = true)
    public List<LimitDebt> getAllLimitDebt();
}
