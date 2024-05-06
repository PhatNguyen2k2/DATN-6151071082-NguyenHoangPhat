import React, { useEffect, useState } from "react";
import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import axios from "axios";
import Route from "./Route";
const ListRoute = () => {
  const [routes, setRoutes] = useState([]);
  const getRoute = async () => {
    const route = await axios.get("http://localhost:8080/api/route");
    setRoutes(route.data);
  };
  useEffect(() => {
    getRoute();
  }, []);
  console.log(routes);
  return (
    <Container fluid>
      {routes.length > 0 && (
        <>
          {routes.map((item, index) => (
            <Route key={index} data={item} />
          ))}
        </>
      )}
    </Container>
  );
};
export default ListRoute;
