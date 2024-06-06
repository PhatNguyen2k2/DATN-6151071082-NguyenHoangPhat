import React from "react";
import { View, Text, TouchableOpacity, StyleSheet } from "react-native";
import Icon from "react-native-vector-icons/FontAwesome";
import * as RootNavigation from "../components/RootNavigation";

const HomeScreen = () => {
  return (
    <View style={styles.container}>
      <Text style={styles.header}>Home</Text>
      <View style={styles.iconContainer}>
        <TouchableOpacity
          style={styles.iconButton}
          onPress={() => RootNavigation.navigate("VehicleType")}
        >
          <Icon name="car" size={50} color="#007BFF" />
          <Text style={styles.iconText}>Vehicle Types</Text>
        </TouchableOpacity>
        <TouchableOpacity
          style={styles.iconButton}
          onPress={() => RootNavigation.navigate("VehicleTypeSelection")}
        >
          <Icon name="truck" size={50} color="#007BFF" />
          <Text style={styles.iconText}>Vehicles</Text>
        </TouchableOpacity>
      </View>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#f8f8f8",
  },
  header: {
    fontSize: 24,
    fontWeight: "bold",
    marginBottom: 20,
  },
  iconContainer: {
    flexDirection: "row",
    justifyContent: "space-around",
    width: "100%",
  },
  iconButton: {
    justifyContent: "center",
    alignItems: "center",
    marginHorizontal: 20,
  },
  iconText: {
    marginTop: 10,
    fontSize: 16,
    color: "#007BFF",
  },
});

export default HomeScreen;
