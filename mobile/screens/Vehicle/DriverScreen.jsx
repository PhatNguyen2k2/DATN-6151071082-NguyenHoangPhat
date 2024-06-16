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
// const apiUrl = `http://192.168.1.141:8080/api/employee`;
const apiUrl = `http://172.16.103.244:8080/api/employee`;
const DriverScreen = () => {
  const [drivers, setDrivers] = useState([]);
  const [driver, setDriver] = useState({});
  const [editingIndex, setEditingIndex] = useState(null);
  const [isFormVisible, setIsFormVisible] = useState(false);

  useEffect(() => {
    fetchDrivers();
  }, []);

  const fetchDrivers = async () => {
    try {
      const response = await axios.get(`${apiUrl}/driver`);
      setDrivers(response.data);
    } catch (error) {
      Alert.alert("Error", "Failed to fetch drivers");
    }
  };

  const addDriver = async () => {
    const { employeeId, employeeName, phoneNumber } = driver;

    if (!employeeId || !employeeName || !phoneNumber) {
      Alert.alert("Error", "All fields are required");
      return;
    }

    try {
      if (editingIndex !== null) {
        await axios.put(`${apiUrl}/drivers/${driver.employeeId}`, driver);
        let newDrivers = [...drivers];
        newDrivers[editingIndex] = { ...driver };
        setDrivers(newDrivers);
        setEditingIndex(null);
      } else {
        const response = await axios.post(`${apiUrl}/driver`, driver);
        setDrivers([...drivers, response.data]);
      }
      setDriver({});
      setIsFormVisible(false); // Hide the form after adding or updating
    } catch (error) {
      Alert.alert("Error", "Failed to save driver");
    }
  };

  const editDriver = (index) => {
    setEditingIndex(index);
    setDriver({ ...drivers[index] });
    setIsFormVisible(true); // Show the form when editing
  };

  const deleteDriver = async (employeeId) => {
    try {
      await axios.delete(`${apiUrl}/drivers/${employeeId}`);
      setDrivers(drivers.filter((driver) => driver.employeeId !== employeeId));
    } catch (error) {
      Alert.alert("Error", "Failed to delete driver");
    }
  };

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Manage Drivers</Text>
      {!isFormVisible && (
        <TouchableOpacity
          style={styles.showFormButton}
          onPress={() => setIsFormVisible(true)}
        >
          <Text style={styles.buttonText}>Thêm tài xế mới</Text>
        </TouchableOpacity>
      )}
      {isFormVisible && (
        <View style={styles.formContainer}>
          <View style={styles.formRow}>
            <Text style={styles.formLabel}>Mã tài xế</Text>
            <TextInput
              style={styles.formInput}
              placeholder="Unique ID"
              value={
                driver.employeeId !== undefined
                  ? driver.employeeId.toString()
                  : ""
              }
              onChangeText={(text) =>
                setDriver({ ...driver, employeeId: text })
              }
            />
          </View>
          <View style={styles.formRow}>
            <Text style={styles.formLabel}>Tên</Text>
            <TextInput
              style={styles.formInput}
              placeholder="Full Name"
              value={
                driver.employeeName !== undefined ? driver.employeeName : ""
              }
              onChangeText={(text) =>
                setDriver({ ...driver, employeeName: text })
              }
            />
          </View>
          <View style={styles.formRow}>
            <Text style={styles.formLabel}>Số điện thoại</Text>
            <TextInput
              style={styles.formInput}
              placeholder="Phone Number"
              value={driver.phoneNumber !== undefined ? driver.phoneNumber : ""}
              onChangeText={(text) =>
                setDriver({ ...driver, phoneNumber: text })
              }
            />
          </View>
          <View style={styles.buttonRow}>
            <TouchableOpacity style={styles.smallButton} onPress={addDriver}>
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
        data={drivers}
        keyExtractor={(item) => item.employeeId}
        renderItem={({ item, index }) => (
          <View style={styles.itemContainer}>
            <View style={styles.itemDetails}>
              <Text style={styles.itemText}>
                <Text style={styles.itemLabel}>Mã tài xế:</Text>{" "}
                {item.employeeId}
              </Text>
              <Text style={styles.itemText}>
                <Text style={styles.itemLabel}>Tên:</Text> {item.employeeName}
              </Text>
              <Text style={styles.itemText}>
                <Text style={styles.itemLabel}>Số điện thoại:</Text>{" "}
                {item.phoneNumber}
              </Text>
            </View>
            <View style={styles.iconContainer}>
              <TouchableOpacity onPress={() => editDriver(index)}>
                <Icon name="edit" size={20} color="blue" />
              </TouchableOpacity>
              <TouchableOpacity onPress={() => deleteDriver(item.employeeId)}>
                <Icon name="trash" size={20} color="red" />
              </TouchableOpacity>
            </View>
          </View>
        )}
      />
    </View>
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

export default DriverScreen;
