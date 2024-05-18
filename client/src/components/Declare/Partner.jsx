import React, { useEffect, useState } from "react";
import { Container, Table, Dropdown } from "react-bootstrap";
import axios from "axios";

const Partner = () => {
  const [partner, setPartner] = useState([]);
  const [filterPartner, setFilterPartner] = useState([]);
  const getPartner = async () => {
    const partners = await axios.get("http://localhost:8080/api/partner");
    setPartner(partners.data);
  };
  const partnerType = (item) => {
    setFilterPartner(
      partner.filter((p) => {
        if (item === "type1") {
          return p.partnertype.partnerTypeId === 1;
        } else {
          return p.partnertype.partnerTypeId === 2;
        }
      })
    );
  };
  useEffect(() => {
    getPartner();
    partnerType("type1");
  }, []);
  return (
    <Container fluid>
      <div style={{ textAlign: "center" }}>
        <span style={{ fontSize: "30px" }}>Khai báo nhà cung cấp</span>
      </div>
      <div style={{ float: "right", marginRight: "20px" }}>
        <Dropdown>
          <Dropdown.Toggle variant="secondary" id="dropdown-basic">
            Loại nhà cung cấp
          </Dropdown.Toggle>
          <Dropdown.Menu>
            <Dropdown.Item onClick={() => partnerType("type1")}>
              Cung cấp xe
            </Dropdown.Item>
            <Dropdown.Item onClick={() => partnerType("type2")}>
              Cung cấp nhân viên
            </Dropdown.Item>
          </Dropdown.Menu>
        </Dropdown>
      </div>
      <Table striped>
        <thead>
          <tr>
            <th>Id</th>
            <th>Tên nhà cung cấp</th>
            <th>Loại nhà cung cấp</th>
          </tr>
        </thead>
        <tbody>
          {filterPartner.length > 0
            ? filterPartner.map((p) => (
                <tr key={p.partnerId}>
                  <td>{p.partnerId}</td>
                  <td>{p.partnerName}</td>
                  <td>{p.partnertype.partnerTypeName}</td>
                </tr>
              ))
            : partner.map((p) => (
                <tr key={p.partnerId}>
                  <td>{p.partnerId}</td>
                  <td>{p.partnerName}</td>
                  <td>{p.partnertype.partnerTypeName}</td>
                </tr>
              ))}
        </tbody>
      </Table>
    </Container>
  );
};
export default Partner;
