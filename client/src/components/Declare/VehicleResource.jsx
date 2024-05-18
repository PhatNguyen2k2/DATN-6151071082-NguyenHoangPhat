import React, { useEffect, useState } from "react";
import { Container, Table } from "react-bootstrap";
import axios from "axios";

const VehicleResource = () => {
  const [vehicleResource, setVehicleResource] = useState([]);
  const getVehicleResource = async () => {
    const vehicleResources = await axios.get(
      "http://localhost:8080/api/partner/resource"
    );
    setVehicleResource(vehicleResources.data);
  };
  useEffect(() => {
    getVehicleResource();
  }, []);
  return (
    <Container fluid>
      <div style={{ textAlign: "center" }}>
        <span style={{ fontSize: "30px" }}>Nguồn lực của nhà cung cấp</span>
      </div>
      <Table striped>
        <thead>
          <tr>
            <th>Id</th>
            <th>Tên hợp đồng</th>
            <th>Nhà cung cấp</th>
            <th>Loại xe</th>
            <th>Số tuyến đáp ứng trong ngày</th>
          </tr>
        </thead>
        <tbody>
          {vehicleResource.length > 0 &&
            vehicleResource.map((v) => (
              <tr key={v.transportResourceId}>
                <td>{v.vehicleAgreement.vehicleAgreementId}</td>
                <td>{v.vehicleAgreement.vehicleAgreementName}</td>
                <td>{v.vehicleAgreement.partner.partnerName}</td>
                <td>
                  {v.vehicletype.vehiclegroup.vehicleGroupName}{" "}
                  {v.vehicletype.weight.toString()} kg
                </td>
                <td>{v.numOfVehicleCanProvideInDay}</td>
              </tr>
            ))}
        </tbody>
      </Table>
    </Container>
  );
};
export default VehicleResource;
