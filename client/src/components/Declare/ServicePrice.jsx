import React, { useEffect, useState } from "react";
import { Container, Table, Dropdown } from "react-bootstrap";
import axios from "axios";

const ServicePrice = () => {
  const [vehicleType, setVehicleType] = useState([]);
  const [servicePrice, setServicePrice] = useState([]);
  const getVehicleType = async () => {
    const vehicleTypes = await axios.get(
      "http://localhost:8080/api/route/vehicleType"
    );
    setVehicleType(vehicleTypes.data);
  };
  const getServicePrice = async (item) => {
    const servicePrices = await axios.get(
      `http://localhost:8080/api/partner/servicePrice/${item}`
    );
    setServicePrice(servicePrices.data);
  };
  useEffect(() => {
    getVehicleType();
  }, []);
  return (
    <Container fluid>
      <div style={{ textAlign: "center" }}>
        <span style={{ fontSize: "30px" }}>Bảng giá dịch vụ áp dụng</span>
      </div>
      <div style={{ float: "right", marginRight: "20px" }}>
        <Dropdown>
          <Dropdown.Toggle variant="secondary" id="dropdown-basic">
            Loại xe
          </Dropdown.Toggle>
          <Dropdown.Menu>
            {vehicleType.map((v) => (
              <Dropdown.Item onClick={() => getServicePrice(v.vehicleTypeId)}>
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
            <th>Tên nhà cung cấp</th>
            <th>Loại xe</th>
            <th>MOQ</th>
            <th>Giá thuê xe ngày</th>
            <th>Giá theo km</th>
            <th>Phí bốc xếp</th>
            <th>Phí ngày lễ</th>
            <th>Phí buổi đêm</th>
            <th>Phí thêm điểm dừng</th>
            <th>Phí thời gian chờ</th>
            <th>Phí cầu đường</th>
          </tr>
        </thead>
        <tbody>
          {servicePrice.length > 0 ? (
            servicePrice.map((p) => (
              <tr key={p.feeOnKilometerId}>
                <td>{p.feeOnKilometerId}</td>
                <td>{p.servicePrice.vehicleAgreement.partner.partnerName}</td>
                <td>
                  {p.servicePrice.vehicletype.vehiclegroup.vehicleGroupName}{" "}
                  {p.servicePrice.vehicletype.weight.toString()} kg
                </td>
                <td>{p.servicePrice.moq} VND</td>
                <td>{p.servicePrice.costOfDay} VND</td>
                <td>{p.cost} VND</td>
                <td>
                  {p.servicePrice.loadingFee ? p.servicePrice.loadingFee : 0}{" "}
                  VND
                </td>
                <td>
                  {p.servicePrice.holidayFee ? p.servicePrice.holidayFee : 0}{" "}
                  VND
                </td>
                <td>
                  {p.servicePrice.nightFee ? p.servicePrice.nightFee : 0} VND
                </td>
                <td>
                  {p.servicePrice.addingStopLocationFee
                    ? p.servicePrice.addingStopLocationFee
                    : 0}{" "}
                  VND
                </td>
                <td>
                  {p.servicePrice.waitingTimeFee
                    ? p.servicePrice.waitingTimeFee
                    : 0}{" "}
                  VND
                </td>
                <td>{p.servicePrice.tolls ? p.servicePrice.tolls : 0} VND</td>
              </tr>
            ))
          ) : (
            <span>Hãy chọn loại xe</span>
          )}
        </tbody>
      </Table>
    </Container>
  );
};
export default ServicePrice;
