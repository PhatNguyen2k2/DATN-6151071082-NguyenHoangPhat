import React, { useState, useEffect } from "react";
import {
  View,
  Text,
  TouchableOpacity,
  FlatList,
  StyleSheet,
} from "react-native";
import axios from "axios";
import * as RootNavigation from "../../components/RootNavigation";
import CustomHeader from "../../components/CustomHeader";
const apiUrl = `http://${global.ip}:8080/api/route/vehicleType`;
const VehicleTypeSelectionScreen = () => {
  const [vehicleTypes, setVehicleTypes] = useState([]);

  useEffect(() => {
    fetchVehicleTypes();
  }, []);

  const fetchVehicleTypes = async () => {
    try {
      const response = await axios.get(apiUrl);
      setVehicleTypes(response.data);
    } catch (error) {
      Alert.alert("Error", "Failed to fetch vehicle types");
    }
  };
  return (
    <>
      <CustomHeader title="Vehicle Type Selection" />
      <View style={styles.container}>
        <Text style={styles.title}>Chọn loại xe</Text>
        <FlatList
          data={vehicleTypes}
          keyExtractor={(item) => item.vehicleTypeId}
          renderItem={({ item }) => (
            <TouchableOpacity
              style={styles.itemContainer}
              onPress={() =>
                RootNavigation.navigate("Vehicle", {
                  vehicleTypeId: item.vehicleTypeId,
                  vehicleGroup: item.vehiclegroup.vehicleGroupName,
                  weight: item.weight,
                })
              }
            >
              <Text style={styles.itemText}>
                {item.vehiclegroup.vehicleGroupName} {item.weight} kg
              </Text>
            </TouchableOpacity>
          )}
        />
      </View>
    </>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
    backgroundColor: "#f8f8f8",
  },
  title: {
    fontSize: 24,
    fontWeight: "bold",
    marginBottom: 20,
    textAlign: "center",
  },
  itemContainer: {
    padding: 15,
    backgroundColor: "#fff",
    borderRadius: 8,
    shadowColor: "#000",
    shadowOffset: { width: 0, height: 2 },
    shadowOpacity: 0.1,
    shadowRadius: 8,
    elevation: 3,
    marginVertical: 8,
  },
  itemText: {
    fontSize: 18,
  },
});

export default VehicleTypeSelectionScreen;
