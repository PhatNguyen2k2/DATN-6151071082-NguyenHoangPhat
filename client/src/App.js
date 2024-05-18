import React, { Suspense } from "react";
import { Route, Routes } from "react-router-dom";
import "./App.css";
import Loading from "./components/Loading/Loading";
import "bootstrap/dist/css/bootstrap.min.css";

const ViewHome = React.lazy(() => import("./pages/ViewHome"));
const ViewPartner = React.lazy(() => import("./pages/ViewPartner"));
const ViewVehicleAgreemnet = React.lazy(() =>
  import("./pages/ViewVehicleAgreement")
);
const ViewVehicleResource = React.lazy(() =>
  import("./pages/ViewVehicleResource")
);
const ViewServicePrice = React.lazy(() => import("./pages/ViewServicePrice"));
const ViewVehicleType = React.lazy(() => import("./pages/ViewVehicleType"));
const ViewShift = React.lazy(() => import("./pages/ViewShift"));
const ViewEmployee = React.lazy(() => import("./pages/ViewEmployee"));
const ViewDebt = React.lazy(() => import("./pages/ViewDebt"));
function App() {
  return (
    <>
      <Suspense fallback={<Loading />}>
        <Routes>
          <Route path="/" element={<ViewHome />} />
          <Route path="/declare/partner" element={<ViewPartner />} />
          <Route
            path="/declare/vehicleAgreement"
            element={<ViewVehicleAgreemnet />}
          />
          <Route
            path="/declare/vehicleResource"
            element={<ViewVehicleResource />}
          />
          <Route path="declare/servicePrice" element={<ViewServicePrice />} />
          <Route path="declare/vehicleType" element={<ViewVehicleType />} />
          <Route path="declare/shift" element={<ViewShift />} />
          <Route path="declare/employee" element={<ViewEmployee />} />
          <Route path="declare/employeeDebt" element={<ViewDebt />} />
        </Routes>
      </Suspense>
    </>
  );
}

export default App;
