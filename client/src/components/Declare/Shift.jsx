import React, { useEffect, useState } from "react";
import { Container, Table } from "react-bootstrap";
import axios from "axios";

const Shift = () => {
  const [shift, setShift] = useState([]);
  const getShift = async () => {
    const shifts = await axios.get("http://localhost:8080/api/route/shift");
    setShift(shifts.data);
  };
  useEffect(() => {
    getShift();
  }, []);
  return (
    <Container fluid>
      <div style={{ textAlign: "center" }}>
        <span style={{ fontSize: "30px" }}>Khai báo ca làm việc</span>
      </div>
      <Table striped>
        <thead>
          <tr>
            <th>Id</th>
            <th>Tên ca</th>
            <th>Số ca</th>
            <th>Thời gian bắt đầu</th>
            <th>Thời gian kết thúc</th>
          </tr>
        </thead>
        <tbody>
          {shift.length > 0 &&
            shift.map((s) => (
              <tr key={s.shiftId}>
                <td>{s.shiftId}</td>
                <td>{s.shiftName}</td>
                <td>{s.shiftNumber}</td>
                <td>{s.timeStart}</td>
                <td>{s.timeEnd}</td>
              </tr>
            ))}
        </tbody>
      </Table>
    </Container>
  );
};
export default Shift;
