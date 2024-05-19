import React from "react";
import { useNavigate } from "react-router-dom";
import Container from "react-bootstrap/Container";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import NavDropdown from "react-bootstrap/NavDropdown";
import Offcanvas from "react-bootstrap/Offcanvas";
import "./Header.scss";

const Header = () => {
  const navigate = useNavigate();
  return (
    <Navbar bg="light" expand="lg" className="header">
      <Container fluid>
        <Navbar.Brand id="logo" onClick={() => navigate("/")}>
          <img
            id="image"
            src="https://res.cloudinary.com/da5yv096f/image/upload/v1715395717/output-onlinepngtools_pbu5c2.png"
            alt="logo"
          />
        </Navbar.Brand>
        <Navbar.Toggle aria-controls={`offcanvasNavbar-expand-${"sm"}`} />
        <Navbar.Offcanvas
          id={`offcanvasNavbar-expand-${"sm"}`}
          aria-labelledby={`offcanvasNavbarLabel-expand-${"sm"}`}
          placement="end"
        >
          <Offcanvas.Header closeButton>
            <Offcanvas.Title id={`offcanvasNavbarLabel-expand-${"sm"}`}>
              Logistic
            </Offcanvas.Title>
          </Offcanvas.Header>
          <Offcanvas.Body>
            <Nav
              className="flex-grow-1 pe-5"
              style={{
                maxHeight: "400px",
                fontSize: "larger",
                fontWeight: "bold",
                marginLeft: "40px",
              }}
            >
              <Nav.Link
                style={{ marginRight: "20px" }}
                onClick={() => navigate("/")}
              >
                Điều phối tuyến
              </Nav.Link>
              <NavDropdown
                title="Khai báo"
                id="navbarScrollingDropdown"
                pullRight
                style={{ marginRight: "20px" }}
              >
                <NavDropdown.Item onClick={() => navigate("/declare/partner")}>
                  Nhà cung cấp
                </NavDropdown.Item>
                <NavDropdown.Item
                  onClick={() => navigate("/declare/vehicleAgreement")}
                >
                  Hợp đồng thuê xe
                </NavDropdown.Item>
                <NavDropdown.Item
                  onClick={() => navigate("/declare/vehicleResource")}
                >
                  Nguồn lực nhà cung cấp
                </NavDropdown.Item>
                <NavDropdown.Item
                  onClick={() => navigate("/declare/servicePrice")}
                >
                  Bảng giá dịch vụ
                </NavDropdown.Item>
                <NavDropdown.Item
                  onClick={() => navigate("/declare/vehicleType")}
                >
                  Loại xe
                </NavDropdown.Item>
                <NavDropdown.Item onClick={() => navigate("/declare/vehicle")}>
                  Danh sách xe
                </NavDropdown.Item>
                <NavDropdown.Item onClick={() => navigate("/declare/shift")}>
                  Ca làm việc
                </NavDropdown.Item>
                <NavDropdown.Item onClick={() => navigate("/declare/employee")}>
                  Nhân viên
                </NavDropdown.Item>
                <NavDropdown.Item
                  onClick={() => navigate("/declare/employeeDebt")}
                >
                  Công nợ nhân viên
                </NavDropdown.Item>
              </NavDropdown>
              <Nav.Link onClick={() => navigate("/booking")}>
                Điều phối xe
              </Nav.Link>
            </Nav>
            <div className="d-flex align-items-center">
              <img
                src={
                  "https://res.cloudinary.com/da5yv096f/image/upload/v1690723022/output-onlinegiftools_dsphas.gif"
                }
                alt="avatar"
                style={{
                  width: "40px",
                  height: "40px",
                  borderRadius: "60%",
                  marginRight: "20px",
                }}
              />
              <span style={{ marginRight: "20px" }}>1211 - Fat nguyen</span>
              <span>Kho Bình Tân</span>
            </div>
          </Offcanvas.Body>
        </Navbar.Offcanvas>
      </Container>
    </Navbar>
  );
};

export default Header;
