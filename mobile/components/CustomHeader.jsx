import React, { useState } from "react";
import {
  View,
  Text,
  StyleSheet,
  Image,
  StatusBar,
  TouchableOpacity,
} from "react-native";
import DropDownPicker from "react-native-dropdown-picker";
import * as RootNavigation from "./RootNavigation";

const CustomHeader = ({ title, logoSource }) => {
  return (
    <View style={styles.container}>
      <StatusBar backgroundColor="#f0f0f0" barStyle="dark-content" />
      <View style={styles.header}>
        <Image source={{ uri: logoSource }} style={styles.logo} />
        <TouchableOpacity onPress={() => RootNavigation.navigate("MainUser")}>
          <Image source={{ uri: userInfo?.avatar }} style={styles.avatar} />
        </TouchableOpacity>
        <TouchableOpacity onPress={handleLogout}>
          <Text>Log Out</Text>
        </TouchableOpacity>
      </View>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    backgroundColor: "#f0f0f0",
    zIndex: 1,
    height: 60,
  },
  header: {
    flexDirection: "row",
    alignItems: "center",
    paddingHorizontal: 10,
    paddingVertical: 10,
    justifyContent: "space-between",
  },
  logo: {
    width: 50,
    height: 50,
    resizeMode: "contain",
  },
  avatar: {
    width: 30,
    height: 30,
    borderRadius: 15,
  },
});

export default CustomHeader;
