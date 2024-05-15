import React, { useMemo, useState } from "react";
import { Container, Table, Dropdown } from "react-bootstrap";
import formatNumber from "accounting-js/lib/formatNumber.js";
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
    const servicePriceData = servicePrices.data;
    servicePriceData.map(async (p) => {
      const res = await axios.get(
        `http://localhost:8080/api/partner/vehicleLoadType?partner=${p.servicePrice.vehicleAgreement.partner.partnerId}&vehicleType=${p.servicePrice.vehicletype.vehicleTypeId}`
      );
      p.shift = res.data.shift.shiftName;
    });

    setServicePrice(servicePriceData);
  };

  useMemo(() => {
    getVehicleType();
  }, [servicePrice]);

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
            <th>Thời gian hoạt động</th>
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
                <td>
                  {formatNumber(p.servicePrice.moq, { precision: 0 })} VND
                </td>
                <td>
                  {formatNumber(p.servicePrice.costOfDay, { precision: 0 })} VND
                </td>
                <td>{formatNumber(p.cost, { precision: 0 })} VND</td>
                <td>
                  {p.servicePrice.loadingFee
                    ? formatNumber(p.servicePrice.loadingFee, { precision: 0 })
                    : 0}{" "}
                  VND
                </td>
                <td>
                  {p.servicePrice.holidayFee
                    ? formatNumber(p.servicePrice.holidayFee, { precision: 0 })
                    : 0}{" "}
                  VND
                </td>
                <td>
                  {p.servicePrice.nightFee
                    ? formatNumber(p.servicePrice.nightFee, { precision: 0 })
                    : 0}{" "}
                  VND
                </td>
                <td>
                  {p.servicePrice.addingStopLocationFee
                    ? formatNumber(p.servicePrice.addingStopLocationFee, {
                        precision: 0,
                      })
                    : 0}{" "}
                  VND
                </td>
                <td>
                  {p.servicePrice.waitingTimeFee
                    ? formatNumber(p.servicePrice.waitingTimeFee, {
                        precision: 0,
                      })
                    : 0}{" "}
                  VND
                </td>
                <td>
                  {p.servicePrice.tolls
                    ? formatNumber(p.servicePrice.tolls, { precision: 0 })
                    : 0}{" "}
                  VND
                </td>
                <td>{p.shift}</td>
              </tr>
            ))
          ) : (
            <th colSpan={13}>Hãy chọn loại xe</th>
          )}
        </tbody>
      </Table>
    </Container>
  );
};
export default ServicePrice;
