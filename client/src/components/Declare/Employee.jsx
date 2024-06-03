import React, { useEffect, useState } from "react";
import { Container, Table, Dropdown } from "react-bootstrap";
import axios from "axios";

const Employee = () => {
  const [employeeShift, setEmployeeShift] = useState([]);
  const [skill, setSkill] = useState([]);
  const [employee, setEmployee] = useState([]);
  const [currentSkill, setCurrentSkill] = useState("");
  const getSkill = async () => {
    const skills = await axios.get(
      "http://localhost:8080/api/employee/skillList"
    );
    setSkill(skills.data);
  };

  const getEmployee = async (item) => {
    const result = new Array();
    const empSkills = await axios.get(
      `http://localhost:8080/api/employee/skill/${item}`
    );
    setCurrentSkill(empSkills?.data[0]?.skill?.skillName);
    employeeShift.forEach((e) => {
      empSkills.data.forEach((skill) => {
        if (skill.employee.employeeId === e.employee.employeeId) {
          result.push(e);
        }
      });
    });
    setEmployee(result);
  };

  const getEmployeeShift = async () => {
    const employeeShifts = await axios.get(
      "http://localhost:8080/api/employee/shift"
    );
    setEmployeeShift(employeeShifts.data);
  };
  useEffect(() => {
    getSkill();
    getEmployeeShift();
  }, []);
  return (
    <Container fluid>
      <div style={{ textAlign: "center" }}>
        <span style={{ fontSize: "30px" }}>Khai báo nhân viên</span>
      </div>
      <div style={{ float: "right", marginRight: "20px" }}>
        <Dropdown>
          <Dropdown.Toggle variant="secondary" id="dropdown-basic">
            Loại kỹ năng
          </Dropdown.Toggle>
          <Dropdown.Menu>
            {skill.map((v) => (
              <Dropdown.Item onClick={() => getEmployee(v.skillId)}>
                {v.skillName}
              </Dropdown.Item>
            ))}
          </Dropdown.Menu>
        </Dropdown>
      </div>
      <Table striped>
        <thead>
          <tr>
            <th>Id</th>
            <th>Tên nhân viên</th>
            <th>Tên bộ phận phụ thuộc</th>
            <th>Kỹ năng</th>
            <th>Kho phục vụ</th>
            <th>Ca đăng kí</th>
            <th>Số điện thoại</th>
          </tr>
        </thead>
        <tbody>
          {employee.length > 0 &&
            employee.map((e) => (
              <tr key={e.employeeShiftId}>
                <td>{e.employee.employeeId}</td>
                <td>{e.employee.employeeName}</td>
                <td>{e.employee.partner.partnerName}</td>
                <td>{currentSkill}</td>
                <td>{e.employee.store.storeName}</td>
                <td>{e.shift.shiftName}</td>
                <td>{e.employee.phoneNumber}</td>
              </tr>
            ))}
        </tbody>
      </Table>
    </Container>
  );
};
export default Employee;
