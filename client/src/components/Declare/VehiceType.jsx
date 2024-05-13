import React, { useEffect, useState } from "react";
import { Container, Table } from "react-bootstrap";
import axios from "axios";

const VehicleType = () => {
  const [vehicleType, setVehicleType] = useState([]);
  const getVehicleType = async () => {
    const vehicleTypes = await axios.get(
      "http://localhost:8080/api/route/vehicleType"
    );
    setVehicleType(vehicleTypes.data);
  };
  useEffect(() => {
    getVehicleType();
  }, []);
  console.log(vehicleType);
  return (
    <Container fluid>
      <div style={{ textAlign: "center" }}>
        <span style={{ fontSize: "30px" }}>Khai báo loại xe</span>
      </div>
      <Table striped>
        <thead>
          <tr>
            <th>Id</th>
            <th>Tên nhóm xe</th>
            <th>Chiều dài</th>
            <th>Chiều rộng</th>
            <th>Chiều cao</th>
            <th>Cân nặng</th>
            <th>Thể tích</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          {vehicleType.length > 0 &&
            vehicleType.map((v) => (
              <tr key={v.vehicleTypeId}>
                <td>{v.vehicleTypeId}</td>
                <td>{v.vehiclegroup.vehicleGroupName}</td>
                <td>{v.length} m</td>
                <td>{v.width} m</td>
                <td>{v.height} m</td>
                <td>{v.weight} kg</td>
                <td>{v.volume} &#13221;</td>
              </tr>
            ))}
        </tbody>
      </Table>
    </Container>
  );
};
export default VehicleType;
