package com.phat.ctrs.repository;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.phat.ctrs.model.EmployeeTransportService;

import jakarta.transaction.Transactional;

@Transactional
public interface IEmployeeTransportServiceRepository extends JpaRepository<EmployeeTransportService, Integer> {
    @Modifying
    @Query(value = "delete from employee_transport_service", nativeQuery = true)
    public void deleteEmployeeTransportService();

    @Modifying
    @Query(value = "insert into employee_transport_service(transport_service_plan_id, employee_id, is_last) values (?1,?2,true)", nativeQuery = true)
    public void insertEmployeeTransportService(BigDecimal transportServicePlanId, BigDecimal employeeId);
}
