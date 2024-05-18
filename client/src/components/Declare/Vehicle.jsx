import React, { useEffect, useState } from "react";
import { Container, Table, Dropdown } from "react-bootstrap";
import axios from "axios";

const Vehicle = () => {
  const [vehicleType, setVehicleType] = useState([]);
  const [vehicle, setVehicle] = useState([]);
  const getVehicleType = async () => {
    const vehicleTypes = await axios.get(
      "http://localhost:8080/api/route/vehicleType"
    );
    setVehicleType(vehicleTypes.data);
  };

  const getVehicle = async (item) => {
    const vehicles = await axios.get(
      `http://localhost:8080/api/route/vehicle/${item}`
    );
    setVehicle(vehicles.data);
  };

  useEffect(() => {
    getVehicleType();
  }, []);
  return (
    <Container fluid>
      <div style={{ textAlign: "center" }}>
        <span style={{ fontSize: "30px" }}>Danh sách xe của kho</span>
      </div>
      <div style={{ float: "right", marginRight: "20px" }}>
        <Dropdown>
          <Dropdown.Toggle variant="secondary" id="dropdown-basic">
            Loại xe
          </Dropdown.Toggle>
          <Dropdown.Menu>
            {vehicleType.map((v) => (
              <Dropdown.Item onClick={() => getVehicle(v.vehicleTypeId)}>
                {v.vehiclegroup.vehicleGroupName} {v.weight.toString()} kg
              </Dropdown.Item>
            ))}
          </Dropdown.Menu>
        </Dropdown>
      </div>
      <Table striped>
        <thead>
          <tr>
            <th>Id</th>
            <th>Biển số</th>
            <th>Tên xe</th>
            <th>Loại xe</th>
            <th>Tài xế</th>
          </tr>
        </thead>
        <tbody>
          {vehicle.length > 0 &&
            vehicle.map((v) => (
              <tr key={v.vehicleId}>
                <td>{v.vehicleId}</td>
                <td>{v.licensePlates}</td>
                <td>{v.vehicleName}</td>
                <td>
                  {v.vehicletype.vehicleTypeId} -
                  {v.vehicletype.vehiclegroup.vehicleGroupName}{" "}
                  {v.vehicletype.weight.toString()} kg
                </td>
                <td>
                  {v.employee.employeeId} - {v.employee.employeeName}
                </td>
              </tr>
            ))}
        </tbody>
      </Table>
    </Container>
  );
};
export default Vehicle;
