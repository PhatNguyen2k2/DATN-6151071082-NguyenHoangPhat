import React, { useRef } from "react";
import {
  View,
  Text,
  TouchableOpacity,
  StyleSheet,
  Animated,
} from "react-native";
import Icon from "react-native-vector-icons/FontAwesome";
import * as RootNavigation from "../components/RootNavigation";
import CustomHeader from "../components/CustomHeader";

const HomeScreen = () => {
  const scaleAnim = useRef(new Animated.Value(1)).current;

  const startAnimation = () => {
    Animated.sequence([
      Animated.timing(scaleAnim, {
        toValue: 1.2,
        duration: 200,
        useNativeDriver: true,
      }),
      Animated.timing(scaleAnim, {
        toValue: 1,
        duration: 200,
        useNativeDriver: true,
      }),
    ]).start();
  };

  return (
    <>
      <CustomHeader title="Home" />
      <View style={styles.container}>
        <Text style={styles.header}>Chọn trang quản lý</Text>
        <View style={styles.iconContainer}>
          <TouchableOpacity
            style={styles.iconButton}
            onPress={() => {
              startAnimation();
              RootNavigation.navigate("VehicleType");
            }}
          >
            <Animated.View style={{ transform: [{ scale: scaleAnim }] }}>
              <Icon name="car" size={60} color="#007BFF" />
            </Animated.View>
            <Text style={styles.iconText}>Khai báo loại xe</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.iconButton}
            onPress={() => {
              startAnimation();
              RootNavigation.navigate("VehicleTypeSelection");
            }}
          >
            <Animated.View style={{ transform: [{ scale: scaleAnim }] }}>
              <Icon name="truck" size={60} color="#007BFF" />
            </Animated.View>
            <Text style={styles.iconText}>Khai báo xe</Text>
          </TouchableOpacity>
        </View>
        <TouchableOpacity
          style={styles.driverButton}
          onPress={() => {
            startAnimation();
            RootNavigation.navigate("Driver");
          }}
        >
          <Animated.View style={{ transform: [{ scale: scaleAnim }] }}>
            <Icon name="user" size={60} color="#007BFF" />
          </Animated.View>
          <Text style={styles.iconText}>Khai báo tài xế</Text>
        </TouchableOpacity>
      </View>
    </>
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
    marginBottom: 20,
  },
  iconButton: {
    justifyContent: "center",
    alignItems: "center",
  },
  driverButton: {
    justifyContent: "center",
    alignItems: "center",
  },
  iconText: {
    marginTop: 10,
    fontSize: 16,
    color: "#007BFF",
  },
});

export default HomeScreen;
