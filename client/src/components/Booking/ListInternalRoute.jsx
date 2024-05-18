import React, { useEffect, useState } from "react";
import Container from "react-bootstrap/Container";
import axios from "axios";
import InternalRoute from "./InternalRoute";
const ListInternalRoute = () => {
  const [plans, setPlans] = useState([]);
  const getPlan = async () => {
    const plan = await axios.get(
      "http://localhost:8080/api/route/internalServicePlan"
    );
    plan.data = plan.data.sort(function (a, b) {
      return a.route.routeId - b.route.routeId;
    });
    setPlans(plan.data);
  };

  useEffect(() => {
    getPlan();
  }, []);
  return (
    <Container fluid>
      {plans.length > 0 && (
        <>
          {plans.map((item, index) => (
            <InternalRoute key={index} plans={item} />
          ))}
        </>
      )}
    </Container>
  );
};
export default ListInternalRoute;
