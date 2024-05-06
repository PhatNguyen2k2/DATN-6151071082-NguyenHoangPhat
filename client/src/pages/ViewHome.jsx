import axios from "axios";
import React, { useEffect, useState } from "react";
import Header from "../components/Header/Header";
import ListRoute from "../components/Route/ListRoute";
const ViewHome = () => {
  return (
    <>
      <Header />
      <ListRoute />
    </>
  );
};
export default ViewHome;
