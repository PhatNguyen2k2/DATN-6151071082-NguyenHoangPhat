import React, { useEffect, useMemo, useState } from "react";
import Container from "react-bootstrap/Container";
import Alert from "react-bootstrap/Alert";
import axios from "axios";
import InternalRoute from "./InternalRoute";
const ListInternalRoute = () => {
  const [plans, setPlans] = useState([]);
  const [vehicleInfo, setVehicleInfo] = useState("");
  const [tranportServicePlanId, setTranportServicePlanId] = useState("");
  const getPlan = async () => {
    const plan = await axios.get(
      "http://localhost:8080/api/route/internalServicePlan"
    );
    plan.data = plan.data.sort(function (a, b) {
      return a.route.routeId - b.route.routeId;
    });
    setPlans(plan.data);
  };
  const getVehicleInfo = (data) => {
    setVehicleInfo(data);
  };
  const getTransportServicePlan = (data) => {
    setTranportServicePlanId(data);
  };
  const updateTransportServicePlan = async () => {
    if (vehicleInfo !== "" && tranportServicePlanId !== "") {
      const plan = await axios.post(
        "http://localhost:8080/api/route/updateVehicle",
        { vehicleInfo: vehicleInfo, planId: tranportServicePlanId }
      );
      plan.data = plan.data.sort(function (a, b) {
        return a.route.routeId - b.route.routeId;
      });
      setPlans(plan.data);
    }
  };
  useMemo(() => {
    getPlan();
  }, []);
  useEffect(() => {
    updateTransportServicePlan();
  }, [vehicleInfo]);
  return (
    <Container fluid>
      {plans.length > 0 ? (
        <>
          {plans.map((item, index) => (
            <InternalRoute
              key={index}
              plans={item}
              vehicleInfo={getVehicleInfo}
              transportServicePlan={getTransportServicePlan}
            />
          ))}
        </>
      ) : (
        <Alert key="info" variant="info">
          Hãy điều phối trước.
        </Alert>
      )}
    </Container>
  );
};
export default ListInternalRoute;
