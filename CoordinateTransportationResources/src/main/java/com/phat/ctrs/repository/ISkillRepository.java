package com.phat.ctrs.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phat.ctrs.model.Skill;

public interface ISkillRepository extends JpaRepository<Skill, BigDecimal> {

}
