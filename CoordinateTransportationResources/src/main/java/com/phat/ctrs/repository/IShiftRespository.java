package com.phat.ctrs.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.Shift;

public interface IShiftRespository extends JpaRepository<Shift, BigDecimal> {
    @Query(value = "select * from shift order by shift_id", nativeQuery = true)
    public List<Shift> getAllShift();
}
