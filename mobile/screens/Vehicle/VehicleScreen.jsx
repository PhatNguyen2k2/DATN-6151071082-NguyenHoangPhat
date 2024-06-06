import React, { useState, useEffect } from "react";
import {
  View,
  Text,
  TouchableOpacity,
  FlatList,
  TextInput,
  StyleSheet,
  Alert,
} from "react-native";
import axios from "axios";
import Icon from "react-native-vector-icons/FontAwesome";
import CustomHeader from "../../components/CustomHeader";
const apiUrl = `http://${global.ip}:8080/api/route/vehicle`;
const VehicleScreen = ({ route }) => {
  const { vehicleTypeId, vehicleGroup, weight } = route.params;
  const [vehicles, setVehicles] = useState([]);
  const [vehicle, setVehicle] = useState({});
  const [editingIndex, setEditingIndex] = useState(null);
  const [isFormVisible, setIsFormVisible] = useState(false);

  useEffect(() => {
    fetchVehicles();
  }, []);
  const fetchVehicles = async () => {
    try {
      const response = await axios.get(`${apiUrl}/${vehicleTypeId}`);
      setVehicles(response.data);
    } catch (error) {
      Alert.alert("Error", "Failed to fetch vehicles");
    }
  };

  const addVehicle = async () => {
    const { id, vehicleName, plateNumber, employeeId } = vehicle;

    if (!id || !vehicleName || !plateNumber || !vehicleTypeId || !employeeId) {
      Alert.alert("Error", "All fields are required");
      return;
    }

    try {
      if (editingIndex !== null) {
        await axios.put(`${apiUrl}/vehicles/${vehicle.id}`, vehicle);
        let newVehicles = [...vehicles];
        newVehicles[editingIndex] = { ...vehicle };
        setVehicles(newVehicles);
        setEditingIndex(null);
      } else {
        const response = await axios.post(`${apiUrl}/vehicles`, {
          ...vehicle,
          vehicleTypeId,
        });
        setVehicles([...vehicles, response.data]);
      }
      setVehicle({});
      setIsFormVisible(false); // Hide the form after adding or updating
    } catch (error) {
      Alert.alert("Error", "Failed to save vehicle");
    }
  };

  const editVehicle = (index) => {
    setEditingIndex(index);
    setVehicle({ ...vehicles[index] });
    setIsFormVisible(true); // Show the form when editing
  };

  const deleteVehicle = async (id) => {
    try {
      await axios.delete(`${apiUrl}/vehicles/${id}`);
      setVehicles(vehicles.filter((vehicle) => vehicle.id !== id));
    } catch (error) {
      Alert.alert("Error", "Failed to delete vehicle");
    }
  };

  return (
    <>
      <CustomHeader title="Vehicle" />
      <View style={styles.container}>
        <Text style={styles.title}>
          {vehicleGroup} {weight} kg
        </Text>
        {!isFormVisible && (
          <TouchableOpacity
            style={styles.showFormButton}
            onPress={() => setIsFormVisible(true)}
          >
            <Text style={styles.buttonText}>Add New Vehicle</Text>
          </TouchableOpacity>
        )}
        {isFormVisible && (
          <View style={styles.formContainer}>
            <View style={styles.formRow}>
              <Text style={styles.formLabel}>Mã xe</Text>
              <TextInput
                style={styles.formInput}
                placeholder="Mã xe"
                value={
                  vehicle.vehicleId !== undefined
                    ? vehicle.vehicleId.toString()
                    : ""
                }
                onChangeText={(text) => setVehicle({ ...vehicle, id: text })}
              />
            </View>
            <View style={styles.formRow}>
              <Text style={styles.formLabel}>Tên xe</Text>
              <TextInput
                style={styles.formInput}
                placeholder="Tên xe"
                value={
                  vehicle.vehicleName !== undefined ? vehicle.vehicleName : ""
                }
                onChangeText={(text) =>
                  setVehicle({ ...vehicle, vehicleName: text })
                }
              />
            </View>
            <View style={styles.formRow}>
              <Text style={styles.formLabel}>Biển số</Text>
              <TextInput
                style={styles.formInput}
                placeholder="Biển số"
                value={
                  vehicle.licensePlates !== undefined
                    ? vehicle.licensePlates
                    : ""
                }
                onChangeText={(text) =>
                  setVehicle({ ...vehicle, plateNumber: text })
                }
              />
            </View>
            <View style={styles.formRow}>
              <Text style={styles.formLabel}>Tài xế</Text>
              <TextInput
                style={styles.formInput}
                placeholder="Tài xế"
                value={
                  vehicle.employee !== undefined
                    ? vehicle.employee.phoneNumber +
                      "-" +
                      vehicle.employee.employeeName
                    : ""
                }
                onChangeText={(text) =>
                  setVehicle({ ...vehicle, employeeId: text })
                }
              />
            </View>
            <View style={styles.buttonRow}>
              <TouchableOpacity style={styles.smallButton} onPress={addVehicle}>
                <Text style={styles.buttonText}>
                  {editingIndex !== null ? "Update" : "Add"}
                </Text>
              </TouchableOpacity>
              <TouchableOpacity
                style={[styles.smallButton, styles.cancelButton]}
                onPress={() => setIsFormVisible(false)}
              >
                <Text style={styles.buttonText}>Cancel</Text>
              </TouchableOpacity>
            </View>
          </View>
        )}
        <FlatList
          data={vehicles}
          keyExtractor={(item) => item.vehicleId}
          renderItem={({ item, index }) => (
            <View style={styles.itemContainer}>
              <View style={styles.itemDetails}>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Mã xe:</Text> {item.vehicleId}
                </Text>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Tên xe:</Text>{" "}
                  {item.vehicleName}
                </Text>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Biển số:</Text>{" "}
                  {item.licensePlates}
                </Text>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Tài xế:</Text>{" "}
                  {item.employee.phoneNumber}-{item.employee.employeeName}
                </Text>
              </View>
              <View style={styles.iconContainer}>
                <TouchableOpacity onPress={() => editVehicle(index)}>
                  <Icon name="edit" size={20} color="blue" />
                </TouchableOpacity>
                <TouchableOpacity onPress={() => deleteVehicle(item.id)}>
                  <Icon name="trash" size={20} color="red" />
                </TouchableOpacity>
              </View>
            </View>
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
    fontSize: 23,
    fontWeight: "bold",
    marginBottom: 20,
    textAlign: "center",
  },
  formContainer: {
    backgroundColor: "#fff",
    padding: 20,
    borderRadius: 10,
    shadowColor: "#000",
    shadowOffset: { width: 0, height: 2 },
    shadowOpacity: 0.1,
    shadowRadius: 8,
    elevation: 3,
  },
  formRow: {
    flexDirection: "row",
    alignItems: "center",
    marginBottom: 10,
  },
  formLabel: {
    fontSize: 16,
    flex: 1,
  },
  formInput: {
    flex: 2,
    borderColor: "#ccc",
    borderWidth: 1,
    padding: 10,
    borderRadius: 5,
  },
  buttonRow: {
    flexDirection: "row",
    justifyContent: "space-between",
    marginTop: 10,
  },
  smallButton: {
    backgroundColor: "#007BFF",
    paddingVertical: 10,
    paddingHorizontal: 20,
    borderRadius: 5,
    alignItems: "center",
  },
  cancelButton: {
    backgroundColor: "#dc3545",
  },
  buttonText: {
    color: "#fff",
    fontSize: 16,
  },
  showFormButton: {
    backgroundColor: "#28a745",
    paddingVertical: 15,
    paddingHorizontal: 30,
    borderRadius: 5,
    alignItems: "center",
    marginVertical: 10,
  },
  itemContainer: {
    flexDirection: "row",
    justifyContent: "space-between",
    alignItems: "center",
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
  itemDetails: {
    flex: 1,
  },
  itemText: {
    fontSize: 16,
    marginBottom: 5,
  },
  itemLabel: {
    fontWeight: "bold",
  },
  iconContainer: {
    flexDirection: "row",
    justifyContent: "space-between",
    width: 60,
  },
});

export default VehicleScreen;
