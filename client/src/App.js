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
        </Routes>
      </Suspense>
    </>
  );
}

export default App;
