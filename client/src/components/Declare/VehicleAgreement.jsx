import React, { useEffect, useState } from "react";
import { Container, Table } from "react-bootstrap";
import axios from "axios";

const VehicleAgreement = () => {
  const [vehicleAgreement, setVehicleAgreement] = useState([]);
  const getVehicleAgreement = async () => {
    const vehicleAgreements = await axios.get(
      "http://localhost:8080/api/partner/agreement"
    );
    setVehicleAgreement(vehicleAgreements.data);
  };
  useEffect(() => {
    getVehicleAgreement();
  }, []);
  console.log(vehicleAgreement);
  return (
    <Container fluid>
      <div style={{ textAlign: "center" }}>
        <span style={{ fontSize: "30px" }}>Hợp đồng thuê xe của kho</span>
      </div>
      <Table striped>
        <thead>
          <tr>
            <th>Id</th>
            <th>Tên hợp đồng</th>
            <th>Nhà cung cấp</th>
            <th>Loại hình hợp đồng</th>
            <th>Gia hạn hợp đồng</th>
            <th>Số lần tối đa vi phạm</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          {vehicleAgreement.length > 0 &&
            vehicleAgreement.map((v) => (
              <tr key={v.vehicleAgreementId}>
                <td>{v.vehicleAgreementId}</td>
                <td>{v.vehicleAgreementName}</td>
                <td>{v.partner.partnerName}</td>
                <td>
                  {v.vehicleRentalAgreementType.vehicleRentalAgreementTypeName}
                </td>
                <td>{v.agreementExtended.toString()}</td>
                <td>{v.maximumNumberOfViolations}</td>
              </tr>
            ))}
        </tbody>
      </Table>
    </Container>
  );
};
export default VehicleAgreement;
