import React, { useEffect, useState } from "react";
import { Link, NavLink, useNavigate } from "react-router-dom";
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
            src="https://res.cloudinary.com/da5yv096f/image/upload/v1676201571/petcafeLogo_yz4ltv.png"
            alt="logo"
          />
        </Navbar.Brand>
        <Navbar.Toggle aria-controls={`offcanvasNavbar-expand-${"lg"}`} />
        <Navbar.Offcanvas
          id={`offcanvasNavbar-expand-${"lg"}`}
          aria-labelledby={`offcanvasNavbarLabel-expand-${"lg"}`}
          placement="end"
        >
          <Offcanvas.Header closeButton>
            <Offcanvas.Title id={`offcanvasNavbarLabel-expand-${"lg"}`}>
              Pet Cafe
            </Offcanvas.Title>
          </Offcanvas.Header>
          <Offcanvas.Body>
            <Nav
              className="flex-grow-1 pe-3"
              style={{
                maxHeight: "400px",
                fontSize: "larger",
                fontWeight: "bold",
              }}
            >
              <Nav.Link onClick={() => navigate("/")}>Home</Nav.Link>
              <Nav.Link onClick={() => navigate("/product/drink/all")}>
                Drink
              </Nav.Link>
              <Nav.Link onClick={() => navigate("/product/pet/all")}>
                Pet
              </Nav.Link>
              <Nav.Link onClick={() => navigate("/aboutUs")}>About us</Nav.Link>
            </Nav>
          </Offcanvas.Body>
        </Navbar.Offcanvas>
      </Container>
    </Navbar>
  );
};

export default Header;
