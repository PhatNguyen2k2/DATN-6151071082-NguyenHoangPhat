import React, { useEffect, useState } from "react";
import "./Route.scss";
const Route = (props) => {
  const [data, setData] = useState({});
  useEffect(() => {
    if (props.data) {
      setData(props.data);
    }
  }, [props.data]);
  return (
    <div className="route-container">
      {data && (
        <>
          <div className="route-info">
            <div className="left-info">
              <div className="info-item">
                <span className="label">Route ID:</span>
                <span className="value">{data.routeId}</span>
              </div>
              <div className="info-item">
                <span className="label">Begin Time:</span>
                <span className="value">
                  {String(data.beginTime).slice(11) +
                    " " +
                    String(data.beginTime).slice(0, 10)}
                </span>
              </div>
              <div className="info-item">
                <span className="label">End Time:</span>
                <span className="value">
                  {String(data.endTime).slice(11) +
                    " " +
                    String(data.endTime).slice(0, 10)}
                </span>
              </div>
              <div className="info-item">
                <span className="label">Begin Address:</span>
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
                <span className="label">End Address:</span>
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
                <span className="label">Route Length:</span>
                <span className="value">{data.routeLength} km</span>
              </div>
            </div>
            <div className="right-info">
              <div className="info-item">
                <span className="label">Transport Form:</span>
                <span className="value">
                  {data.transportForm?.transportFormName}
                </span>
              </div>
              <div className="info-item">
                <span className="label">Vehicle Type:</span>
                <span className="value">
                  {data.vehicleType?.vehiclegroup?.vehicleGroupName}
                </span>
                <span className="sub-value">
                  Length: {data.vehicleType?.length} m
                </span>
                <span className="sub-value">
                  Weight: {data.vehicleType?.weight} kg
                </span>
                <span className="sub-value">
                  Width: {data.vehicleType?.width} m
                </span>
                <span className="sub-value">
                  Height: {data.vehicleType?.height} m
                </span>
                <span className="sub-value">
                  Volume: {data.vehicleType?.volume} m3
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
