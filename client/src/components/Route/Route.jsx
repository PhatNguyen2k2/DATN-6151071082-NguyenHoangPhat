import React, { useEffect, useMemo, useState } from "react";
import "./Route.scss";
const Route = (props) => {
  const [data, setData] = useState({});
  const [plan, setPlan] = useState({});
  useMemo(() => {
    if (props.data) {
      setData(props.data);
    }
    if (props.plans) {
      setPlan(props.plans);
    }
  }, [props.data, props.plans]);
  return (
    <div className="route-container">
      {data && (
        <>
          <div className="route-info">
            <div className="left-info">
              <div className="info-item">
                <span className="label">Mã tuyến:</span>
                <span className="value">{data.routeId}</span>
              </div>
              <div className="info-item">
                <span className="label">Thời gian bắt đầu:</span>
                <span className="value">
                  {String(data.beginTime).slice(11) +
                    " " +
                    String(data.beginTime).slice(0, 10)}
                </span>
              </div>
              <div className="info-item">
                <span className="label">Thời gian kết thúc:</span>
                <span className="value">
                  {String(data.endTime).slice(11) +
                    " " +
                    String(data.endTime).slice(0, 10)}
                </span>
              </div>
              <div className="info-item">
                <span className="label">Địa chỉ bắt đầu:</span>
                <span className="value">
                  {data.address?.addressDetail +
                    ", " +
                    data.address?.ward?.wardName +
                    ", " +
                    data.address?.ward?.district?.districtName +
                    ", " +
                    data.address?.ward?.district?.province?.provinceName +
                    ", " +
                    data.address?.ward?.district?.province?.country
                      ?.countryName}
                </span>
              </div>
              <div className="info-item">
                <span className="label">Địa chỉ kết thúc:</span>
                <span className="value">
                  {data.address2?.addressDetail +
                    ", " +
                    data.address2?.ward?.wardName +
                    ", " +
                    data.address2?.ward?.district?.districtName +
                    ", " +
                    data.address2?.ward?.district?.province?.provinceName +
                    ", " +
                    data.address2?.ward?.district?.province?.country
                      ?.countryName}
                </span>
              </div>
              <div className="info-item">
                <span className="label">Độ dài:</span>
                <span className="value">{data.routeLength} km</span>
              </div>
              <div className="info-item">
                <span className="label">Nhà cung cấp:</span>
                {Object.keys(plan).length > 0 ? (
                  <span className="value" style={{ color: "blueviolet" }}>
                    {plan?.partner?.partnerName} - {plan?.costPartner} VND
                  </span>
                ) : (
                  <span className="value" style={{ color: "indigo" }}>
                    Chưa có nhà cung cấp
                  </span>
                )}
              </div>
            </div>
            <div className="right-info">
              <div className="info-item">
                <span className="label">Loại hình vận chuyển:</span>
                {data.transportForm?.transportFormId === 1 ? (
                  <span className="value" style={{ color: "green" }}>
                    {data.transportForm?.transportFormName}
                  </span>
                ) : (
                  <span className="value" style={{ color: "red" }}>
                    {data.transportForm?.transportFormName}
                  </span>
                )}
              </div>
              <div className="info-item">
                <span className="label">Loại xe:</span>
                <span className="value">
                  {data.vehicleType?.vehiclegroup?.vehicleGroupName}
                </span>
                <span className="sub-value">
                  Dài: {data.vehicleType?.length} m
                </span>
                <span className="sub-value">
                  Nặng: {data.vehicleType?.weight} kg
                </span>
                <span className="sub-value">
                  Rộng: {data.vehicleType?.width} m
                </span>
                <span className="sub-value">
                  Cao: {data.vehicleType?.height} m
                </span>
                <span className="sub-value">
                  Thể tích: {data.vehicleType?.volume} m3
                </span>
              </div>
            </div>
          </div>
        </>
      )}
    </div>
  );
};
export default Route;
