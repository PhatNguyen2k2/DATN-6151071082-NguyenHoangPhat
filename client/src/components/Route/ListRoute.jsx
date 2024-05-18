import React, { useEffect, useState } from "react";
import Container from "react-bootstrap/Container";
import axios from "axios";
import Route from "./Route";
import Button from "react-bootstrap/esm/Button";
const ListRoute = () => {
  const [routes, setRoutes] = useState([]);
  const [plans, setPlans] = useState([]);
  const getRoute = async () => {
    const route = await axios.get("http://localhost:8080/api/route");
    route.data = route.data.sort(function (a, b) {
      return a.routeId - b.routeId;
    });
    setRoutes(route.data);
  };
  const getPlan = async () => {
    const plan = await axios.get("http://localhost:8080/api/route/servicePlan");
    plan.data = plan.data.sort(function (a, b) {
      return a.route.routeId - b.route.routeId;
    });
    setPlans(plan.data);
  };

  const getPartner = async () => {
    const partner = await axios.get(
      "http://localhost:8080/api/route/choosePartner"
    );
    partner.data = partner.data.sort(function (a, b) {
      return a.route.routeId - b.route.routeId;
    });
    setPlans(partner.data);
  };
  const getEmployee = async () => {
    const employees = await axios.get(
      "http://localhost:8080/api/route/chooseEmployee"
    );
    employees.data = employees.data.sort(function (a, b) {
      return a.route.routeId - b.route.routeId;
    });
    setPlans(employees.data);
  };
  const resetPlan = async () => {
    const plan = await axios.get("http://localhost:8080/api/route/resetPlan");
    plan.data = plan.data.sort(function (a, b) {
      return a.route.routeId - b.route.routeId;
    });
    setPlans(plan.data);
  };
  useEffect(() => {
    getRoute();
    getPlan();
  }, []);
  return (
    <Container fluid>
      <Button
        style={{ margin: "5px 20px 10px 0px" }}
        onClick={() => getPartner()}
        variant="info"
      >
        Tìm nhà cung cấp
      </Button>
      <Button
        style={{ margin: "5px 0px 10px" }}
        onClick={() => getEmployee()}
        variant="success"
      >
        Tìm nhân viên
      </Button>
      <Button
        style={{ margin: "5px 0px 10px", float: "right" }}
        onClick={() => resetPlan()}
        variant="secondary"
      >
        Reset
      </Button>
      {routes.length > 0 && (
        <>
          {routes.map((item, index) => (
            <Route key={index} data={item} plans={plans[index]} />
          ))}
        </>
      )}
    </Container>
  );
};
export default ListRoute;
