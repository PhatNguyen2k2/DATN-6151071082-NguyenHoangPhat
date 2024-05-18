import React, { useEffect, useState } from "react";
import { Container, Table } from "react-bootstrap";
import formatNumber from "accounting-js/lib/formatNumber.js";
import axios from "axios";

const Debt = () => {
  const [employee, setEmployee] = useState([]);
  const getDebt = async () => {
    const currentDebt = await axios.get(
      "http://localhost:8080/api/employee/currentDebt"
    );
    const limitDebt = await axios.get(
      "http://localhost:8080/api/employee/limitDebt"
    );
    setEmployee(
      currentDebt.data.map((debt) => {
        let limit = limitDebt.data.find(
          (l) => l.employee.employeeId === debt.employee.employeeId
        );
        return { ...debt, ...limit };
      })
    );
  };
  useEffect(() => {
    getDebt();
  }, []);
  return (
    <Container fluid>
      <div style={{ textAlign: "center" }}>
        <span style={{ fontSize: "30px" }}>Công nợ nhân viên</span>
      </div>
      <Table striped>
        <thead>
          <tr>
            <th>User</th>
            <th>Tên nhân viên</th>
            <th>Tên bộ phận phụ thuộc</th>
            <th>Công nợ hiện tại</th>
            <th>Hạn mức công nợ</th>
          </tr>
        </thead>
        <tbody>
          {employee.length > 0 &&
            employee.map((e) => (
              <tr key={e.currentDebtId}>
                <td>{e.employee.employeeId}</td>
                <td>{e.employee.employeeName}</td>
                <td>{e.employee.partner.partnerName}</td>
                <td>{formatNumber(e.totalDebt, { precision: 0 })} VND</td>
                <td>{formatNumber(e.limitDebtValue, { precision: 0 })} VND</td>
              </tr>
            ))}
        </tbody>
      </Table>
    </Container>
  );
};
export default Debt;
