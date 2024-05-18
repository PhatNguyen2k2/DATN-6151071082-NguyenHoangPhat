import React, { useEffect, useState } from "react";
import formatNumber from "accounting-js/lib/formatNumber.js";
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/esm/Button";
import axios from "axios";
import "./InternalRoute.scss";
const InternalRoute = (props) => {
  const [data, setData] = useState({});
  const [vehicle, setVehicle] = useState([]);

  const getVehicle = async () => {
    const vehicles = await axios.get(
      `http://localhost:8080/api/route/vehicle/${data.route.vehicleType.vehicleTypeId}`
    );
    setVehicle(vehicles.data);
  };
  const updateVehicle = async (item) => {
    console.log(item);
  };
  useEffect(() => {
    if (props.plans) {
      setData(props.plans);
    }
  }, [props.data]);
  return (
    <div className="route-container">
      {data && (
        <>
          <div className="route-info">
            <div className="left-info">
              <div className="info-item">
                <span className="label">Tuyến:</span>
                <span className="value">
                  {data?.route?.routeId} - {data?.route?.skill?.skillName}
                </span>
              </div>
              <div className="info-item">
                <span className="label">Thời gian bắt đầu:</span>
                <span className="value">
                  {String(data?.route?.beginTime).slice(11) +
                    " " +
                    String(data?.route?.beginTime).slice(0, 10)}
                </span>
              </div>
              <div className="info-item">
                <span className="label">Thời gian kết thúc:</span>
                <span className="value">
                  {String(data?.route?.endTime).slice(11) +
                    " " +
                    String(data?.route?.endTime).slice(0, 10)}
                </span>
              </div>
              <div className="info-item">
                <span className="label">Địa chỉ bắt đầu:</span>
                <span className="value">Kho Tân Bình</span>
              </div>
              <div className="info-item">
                <span className="label">Địa chỉ kết thúc:</span>
                <span className="value">
                  {data?.route?.address2?.addressDetail +
                    ", " +
                    data?.route?.address2?.ward?.wardName +
                    ", " +
                    data?.route?.address2?.ward?.district?.districtName +
                    ", " +
                    data?.route?.address2?.ward?.district?.province
                      ?.provinceName +
                    ", " +
                    data?.route?.address2?.ward?.district?.province?.country
                      ?.countryName}
                </span>
              </div>
              <div className="info-item">
                <span className="label">Độ dài:</span>
                <span className="value">{data?.route?.routeLength} km</span>
              </div>
              <div className="info-item">
                <span className="label">Thông tin xe:</span>
                {data.vehicleInfo ? (
                  <span className="value" style={{ color: "blueviolet" }}>
                    {data?.vehicleInfo}
                  </span>
                ) : vehicle.length > 0 ? (
                  <Form.Select
                    aria-label="Default select example"
                    size="sm"
                    onChange={(e) => updateVehicle(e.target.value)}
                  >
                    <option>Chọn xe</option>
                    {vehicle.length > 0 &&
                      vehicle.map((v) => (
                        <option key={v.vehicleId} value={v.vehicleId}>
                          {v.vehicleName +
                            " - " +
                            v.licensePlates +
                            " (" +
                            v.employee.employeeId +
                            " - " +
                            v.employee.employeeName +
                            ")"}
                        </option>
                      ))}
                  </Form.Select>
                ) : (
                  <Button
                    key={data.tranportServicePlanId}
                    style={{ margin: "5px 0px 10px" }}
                    onClick={() => getVehicle()}
                    variant="outline-dark"
                    size="sm"
                  >
                    Chọn xe
                  </Button>
                )}
              </div>
            </div>
            <div className="right-info">
              <div className="info-item">
                <span className="label">Loại hình vận chuyển:</span>
                {data?.route?.transportForm?.transportFormId === 1 ? (
                  <span className="value" style={{ color: "green" }}>
                    {data.transportForm?.transportFormName}
                  </span>
                ) : (
                  <span className="value" style={{ color: "red" }}>
                    {data?.route?.transportForm?.transportFormName}
                  </span>
                )}
              </div>
              <div className="info-item">
                <span className="label">Phí thu hộ:</span>
                <span className="value" style={{ color: "coral" }}>
                  {formatNumber(data?.route?.cost, { precision: 0 })} VNĐ
                </span>
              </div>
              <div className="info-item">
                <span className="label">Loại xe:</span>
                <span className="value">
                  {data?.route?.vehicleType?.vehiclegroup?.vehicleGroupName}
                </span>
                <span className="sub-value">
                  Dài: {data?.route?.vehicleType?.length} m
                </span>
                <span className="sub-value">
                  Nặng: {data?.route?.vehicleType?.weight} kg
                </span>
                <span className="sub-value">
                  Rộng: {data?.route?.vehicleType?.width} m
                </span>
                <span className="sub-value">
                  Cao: {data?.route?.vehicleType?.height} m
                </span>
                <span className="sub-value">
                  Thể tích: {data?.route?.vehicleType?.volume} &#13221;
                </span>
              </div>
            </div>
          </div>
        </>
      )}
    </div>
  );
};
export default InternalRoute;
