import React, { useEffect, useState, useCallback } from "react";
import {
  View,
  Text,
  StyleSheet,
  ScrollView,
  Button,
  RefreshControl,
} from "react-native";
import axios from "axios";
import { Picker } from "@react-native-picker/picker";
import CustomHeader from "../../components/CustomHeader";

// const apiUrl = `http://192.168.1.141:8080/api/route`;
const apiUrl = `http://172.16.103.244:8080/api/route`;

const BookingScreen = () => {
  const [plans, setPlans] = useState([]);
  const [vehicles, setVehicles] = useState([]);
  const [selectedVehicleId, setSelectedVehicleId] = useState("");
  const [selectedPlanId, setSelectedPlanId] = useState("");
  const [vehicleInfo, setVehicleInfo] = useState({});
  const [refreshing, setRefreshing] = useState(false);

  const getPlan = async () => {
    try {
      const plan = await axios.get(`${apiUrl}/internalServicePlan/7`);
      plan.data = plan.data.sort((a, b) => a.route.routeId - b.route.routeId);
      setPlans(plan.data);
    } catch (error) {
      console.error("Error fetching plans:", error);
    }
  };

  const getVehicles = async (vehicleTypeId) => {
    try {
      const vehicles = await axios.get(`${apiUrl}/vehicle/${vehicleTypeId}`);
      setVehicles(vehicles.data);
    } catch (error) {
      console.error("Error fetching vehicles:", error);
    }
  };

  const updateVehicle = (vehicleId, planId) => {
    const vehicle = vehicles.find((v) => v.vehicleId === vehicleId);
    const vehicleDetails =
      vehicle.vehicleName +
      " - " +
      vehicle.licensePlates +
      " " +
      vehicle.employee.employeeName +
      " (" +
      vehicle.employee.phoneNumber +
      ")";
    setVehicleInfo(vehicleDetails);
    setSelectedVehicleId(vehicleId);
    setSelectedPlanId(planId);

    const updatedPlans = plans.map((plan) => {
      if (plan.transportServicePlanId === planId) {
        return { ...plan, vehicleInfo: vehicleDetails };
      }
      return plan;
    });
    setPlans(updatedPlans);
  };

  const updateTransportServicePlan = async () => {
    if (vehicleInfo && selectedPlanId) {
      try {
        const response = await axios.post(`${apiUrl}/updateVehicle/7`, {
          vehicleInfo: vehicleInfo,
          planId: selectedPlanId,
        });
        const updatedPlans = response.data.sort(
          (a, b) => a.route.routeId - b.route.routeId
        );
        setPlans(updatedPlans);
      } catch (error) {
        console.error("Error updating transport service plan:", error);
      }
    }
  };

  useEffect(() => {
    getPlan();
  }, []);

  useEffect(() => {
    if (vehicleInfo && selectedPlanId) {
      updateTransportServicePlan();
    }
  }, [vehicleInfo]);

  const onRefresh = useCallback(() => {
    setRefreshing(true);
    getPlan().then(() => setRefreshing(false));
  }, []);

  return (
    <>
      <CustomHeader title="Booking" />
      <ScrollView
        contentContainerStyle={styles.container}
        refreshControl={
          <RefreshControl refreshing={refreshing} onRefresh={onRefresh} />
        }
      >
        {plans.length > 0 ? (
          plans.map((item, index) => (
            <View key={index} style={styles.routeContainer}>
              <View style={styles.infoContainer}>
                <View style={styles.leftInfo}>
                  <InfoItem
                    label="Tuyến:"
                    value={`${item?.route?.routeId} - ${item?.route?.skill?.skillName}`}
                    horizontal
                  />
                  <InfoItem
                    label="Thời gian bắt đầu:"
                    value={`${String(item?.route?.beginTime).slice(
                      11
                    )} ${String(item?.route?.beginTime).slice(0, 10)}`}
                  />
                  <InfoItem
                    label="Thời gian kết thúc:"
                    value={`${String(item?.route?.endTime).slice(11)} ${String(
                      item?.route?.endTime
                    ).slice(0, 10)}`}
                  />
                  <InfoItem
                    label="Địa chỉ bắt đầu:"
                    value={`${item?.route?.address?.addressDetail}, ${item?.route?.address?.ward?.wardName}, ${item?.route?.address?.ward?.district?.districtName}, ${item?.route?.address?.ward?.district?.province?.provinceName}`}
                  />
                  <InfoItem
                    label="Địa chỉ kết thúc:"
                    value={`${item?.route?.address2?.addressDetail}, ${item?.route?.address2?.ward?.wardName}, ${item?.route?.address2?.ward?.district?.districtName}, ${item?.route?.address2?.ward?.district?.province?.provinceName}`}
                  />
                  <InfoItem
                    label="Độ dài tuyến:"
                    value={`${item?.route?.routeLength} km`}
                    horizontal
                  />
                </View>
                <View style={styles.rightInfo}>
                  <InfoItem
                    label="Loại hình vận chuyển:"
                    value={item?.route?.transportForm?.transportFormName}
                    valueStyle={{
                      color:
                        item?.route?.transportForm?.transportFormId === 1
                          ? "green"
                          : "red",
                    }}
                  />
                  <InfoItem
                    label="Nơi đặt xe:"
                    value="Kho Tân Bình"
                    valueStyle={{ color: "coral" }}
                    horizontal
                  />
                  <InfoItem
                    label="Loại xe:"
                    value={
                      item?.route?.vehicleType?.vehiclegroup?.vehicleGroupName
                    }
                    horizontal
                  />
                  <InfoItem
                    label="Chiều dài:"
                    value={`${item?.route?.vehicleType?.length} m`}
                    horizontal
                  />
                  <InfoItem
                    label="Chiều rộng:"
                    value={`${item?.route?.vehicleType?.width} m`}
                    horizontal
                  />
                  <InfoItem
                    label="Cân nặng:"
                    value={`${item?.route?.vehicleType?.weight} kg`}
                    horizontal
                  />
                  <InfoItem
                    label="Chiều cao:"
                    value={`${item?.route?.vehicleType?.height} m`}
                    horizontal
                  />
                  <InfoItem
                    label="Thể tích:"
                    value={`${item?.route?.vehicleType?.volume} ㎥`}
                    horizontal
                  />
                  <View style={styles.infoItem}>
                    <Text style={styles.label}>Thông tin xe:</Text>
                    {item.vehicleInfo ? (
                      <Text style={[styles.value, { color: "blueviolet" }]}>
                        {item.vehicleInfo}
                      </Text>
                    ) : vehicles.length > 0 ? (
                      <View style={styles.pickerContainer}>
                        <Picker
                          selectedValue={selectedVehicleId}
                          style={styles.picker}
                          onValueChange={(itemValue) =>
                            updateVehicle(
                              itemValue,
                              item.transportServicePlanId
                            )
                          }
                        >
                          <Picker.Item label="Chọn xe" value="" />
                          {vehicles.map((v) => (
                            <Picker.Item
                              key={v.vehicleId}
                              label={`${v.vehicleName} - ${v.licensePlates} (${v.employee.employeeId} - ${v.employee.employeeName})`}
                              value={v.vehicleId}
                            />
                          ))}
                        </Picker>
                      </View>
                    ) : (
                      <Button
                        title="Chọn xe"
                        onPress={() =>
                          getVehicles(item.route.vehicleType.vehicleTypeId)
                        }
                      />
                    )}
                  </View>
                </View>
              </View>
            </View>
          ))
        ) : (
          <Text style={styles.alertText}>
            Chờ thông tin tuyến cần điều phối
          </Text>
        )}
      </ScrollView>
    </>
  );
};

const InfoItem = ({ label, value, valueStyle, horizontal }) => (
  <View style={[styles.infoItem, horizontal && styles.horizontalItem]}>
    <Text style={styles.label}>{label}</Text>
    <Text style={[styles.value, valueStyle]}>{value}</Text>
  </View>
);

const styles = StyleSheet.create({
  container: {
    padding: 10,
  },
  routeContainer: {
    marginBottom: 20,
    padding: 10,
    borderWidth: 1,
    borderColor: "#ccc",
    borderRadius: 8,
  },
  infoContainer: {
    flexDirection: "row",
    justifyContent: "space-between",
  },
  leftInfo: {
    flex: 1,
    paddingRight: 10,
  },
  rightInfo: {
    flex: 1,
  },
  infoItem: {
    marginBottom: 10,
  },
  horizontalItem: {
    flexDirection: "row",
    alignItems: "center",
  },
  label: {
    fontWeight: "bold",
    marginRight: 5,
  },
  value: {
    marginTop: 0,
  },
  alertText: {
    color: "blue",
    textAlign: "center",
    marginVertical: 20,
    fontSize: 16,
  },
  pickerContainer: {
    borderWidth: 1,
    borderColor: "#ccc",
    borderRadius: 8,
    overflow: "hidden",
  },
  picker: {
    height: 50,
    width: "100%",
  },
});

export default BookingScreen;
