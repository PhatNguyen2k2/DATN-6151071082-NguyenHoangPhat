package com.phat.ctrs.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phat.ctrs.model.Shift;

public interface IShiftRespository extends JpaRepository<Shift, BigDecimal> {

}
