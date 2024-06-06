import React, { useState, useEffect } from "react";
import {
  View,
  Text,
  TextInput,
  TouchableOpacity,
  FlatList,
  Alert,
  StyleSheet,
} from "react-native";
import Icon from "react-native-vector-icons/FontAwesome";
import axios from "axios";
import CustomHeader from "../../components/CustomHeader";

const apiUrl = `http://${global.ip}:8080/api/route/vehicleType`;

const VehicleTypeScreen = () => {
  const [vehicleTypes, setVehicleTypes] = useState([]);
  const [vehicleType, setVehicleType] = useState({});
  const [editingIndex, setEditingIndex] = useState(null);
  const [isFormVisible, setIsFormVisible] = useState(false);

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

  const addVehicleType = async () => {
    const { id, groupId, length, width, height, weight, volume } = vehicleType;

    if (!id || !groupId || !length || !width || !height || !weight || !volume) {
      Alert.alert("Error", "All fields are required");
      return;
    }

    try {
      if (editingIndex !== null) {
        await axios.put(
          `${apiUrl}/vehicleTypes/${vehicleType.id}`,
          vehicleType
        );
        let newVehicleTypes = [...vehicleTypes];
        newVehicleTypes[editingIndex] = { ...vehicleType };
        setVehicleTypes(newVehicleTypes);
        setEditingIndex(null);
      } else {
        const response = await axios.post(
          `${apiUrl}/vehicleTypes`,
          vehicleType
        );
        setVehicleTypes([...vehicleTypes, response.data]);
      }
      setVehicleType({});
      setIsFormVisible(false); // Hide the form after adding or updating
    } catch (error) {
      Alert.alert("Error", "Failed to save vehicle type");
    }
  };

  const editVehicleType = (index) => {
    setEditingIndex(index);
    setVehicleType({ ...vehicleTypes[index] });
    setIsFormVisible(true); // Show the form when editing
  };

  const deleteVehicleType = async (id) => {
    try {
      await axios.delete(`${apiUrl}/vehicleTypes/${id}`);
      setVehicleTypes(
        vehicleTypes.filter((vehicleType) => vehicleType.id !== id)
      );
    } catch (error) {
      Alert.alert("Error", "Failed to delete vehicle type");
    }
  };

  return (
    <>
      <CustomHeader title="Vehicle Type" />
      <View style={styles.container}>
        {!isFormVisible && (
          <TouchableOpacity
            style={styles.showFormButton}
            onPress={() => setIsFormVisible(true)}
          >
            <Text style={styles.buttonText}>Thêm loại xe mới</Text>
          </TouchableOpacity>
        )}
        {isFormVisible && (
          <View style={styles.formContainer}>
            <View style={styles.formRow}>
              <Text style={styles.formLabel}>Mã loại xe</Text>
              <TextInput
                style={styles.formInput}
                placeholder="Không trùng nhau"
                value={
                  vehicleType.vehicleTypeId !== undefined
                    ? vehicleType.vehicleTypeId.toString()
                    : ""
                }
                onChangeText={(text) =>
                  setVehicleType({ ...vehicleType, id: text })
                }
              />
              <Text style={styles.unit}> </Text>
            </View>
            <View style={styles.formRow}>
              <Text style={styles.formLabel}>Chiều dài</Text>
              <TextInput
                style={styles.formInput}
                placeholder="Length"
                value={
                  vehicleType.length !== undefined
                    ? vehicleType.length.toString()
                    : ""
                }
                onChangeText={(text) =>
                  setVehicleType({ ...vehicleType, length: text })
                }
              />
              <Text style={styles.unit}>m</Text>
            </View>
            <View style={styles.formRow}>
              <Text style={styles.formLabel}>Chiều rộng</Text>
              <TextInput
                style={styles.formInput}
                placeholder="Width"
                value={
                  vehicleType.width !== undefined
                    ? vehicleType.width.toString()
                    : ""
                }
                onChangeText={(text) =>
                  setVehicleType({ ...vehicleType, width: text })
                }
              />
              <Text style={styles.unit}>m</Text>
            </View>
            <View style={styles.formRow}>
              <Text style={styles.formLabel}>Chiều cao</Text>
              <TextInput
                style={styles.formInput}
                placeholder="Height"
                value={
                  vehicleType.height !== undefined
                    ? vehicleType.height.toString()
                    : ""
                }
                onChangeText={(text) =>
                  setVehicleType({ ...vehicleType, height: text })
                }
              />
              <Text style={styles.unit}>m</Text>
            </View>
            <View style={styles.formRow}>
              <Text style={styles.formLabel}>Cân nặng</Text>
              <TextInput
                style={styles.formInput}
                placeholder="Weight"
                value={
                  vehicleType.weight !== undefined
                    ? vehicleType.weight.toString()
                    : ""
                }
                onChangeText={(text) =>
                  setVehicleType({ ...vehicleType, weight: text })
                }
              />
              <Text style={styles.unit}>kg</Text>
            </View>
            <View style={styles.formRow}>
              <Text style={styles.formLabel}>Thể tích</Text>
              <TextInput
                style={styles.formInput}
                placeholder="Volume"
                value={
                  vehicleType.volume !== undefined
                    ? vehicleType.volume.toString()
                    : ""
                }
                onChangeText={(text) =>
                  setVehicleType({ ...vehicleType, volume: text })
                }
              />
              <Text style={styles.unit}>&#13221;</Text>
            </View>
            <View style={styles.buttonRow}>
              <TouchableOpacity
                style={styles.smallButton}
                onPress={addVehicleType}
              >
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
          data={vehicleTypes}
          keyExtractor={(item) => item.vehicleTypeId}
          renderItem={({ item, index }) => (
            <View style={styles.itemContainer}>
              <View style={styles.itemDetails}>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Mã loại xe:</Text>{" "}
                  {item.vehicleTypeId}
                </Text>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Nhóm xe:</Text>{" "}
                  {item.vehiclegroup.vehicleGroupName}
                </Text>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Chiều dài:</Text> {item.length}{" "}
                  m
                </Text>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Chiều rộng:</Text> {item.width}{" "}
                  m
                </Text>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Chiều cao:</Text> {item.height}{" "}
                  m
                </Text>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Cân nặng:</Text> {item.weight}{" "}
                  kg
                </Text>
                <Text style={styles.itemText}>
                  <Text style={styles.itemLabel}>Thể tích:</Text> {item.volume}{" "}
                  &#13221;
                </Text>
              </View>
              <View style={styles.iconContainer}>
                <TouchableOpacity onPress={() => editVehicleType(index)}>
                  <Icon name="edit" size={20} color="blue" />
                </TouchableOpacity>
                <TouchableOpacity onPress={() => deleteVehicleType(item.id)}>
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
  formContainer: {
    backgroundColor: "#fff",
    padding: 20,
    borderRadius: 10,
    shadowColor: "#000",
    shadowOffset: { width: 0, height: 2 },
    shadowOpacity: 0.1,
    shadowRadius: 8,
    elevation: 5,
    marginBottom: 20,
  },
  formRow: {
    flexDirection: "row",
    alignItems: "center",
    marginBottom: 15,
  },
  formLabel: {
    fontSize: 16,
    flex: 1,
    fontWeight: "bold",
  },
  formInput: {
    flex: 2,
    borderColor: "#ccc",
    borderWidth: 1,
    padding: 10,
    borderRadius: 5,
    backgroundColor: "#f1f1f1",
  },
  unit: {
    marginLeft: 10,
    fontSize: 16,
    color: "#333",
  },
  buttonRow: {
    flexDirection: "row",
    justifyContent: "space-between",
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

export default VehicleTypeScreen;
