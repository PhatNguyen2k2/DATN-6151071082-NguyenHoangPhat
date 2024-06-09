import React, { useState } from "react";
import {
  View,
  Text,
  StyleSheet,
  Image,
  StatusBar,
  TouchableOpacity,
} from "react-native";
import * as RootNavigation from "./RootNavigation";

const CustomHeader = ({ title }) => {
  return (
    <View style={styles.container}>
      <StatusBar backgroundColor="#f0f0f0" barStyle="dark-content" />
      <View style={styles.header}>
        <Image
          source={{
            uri: "https://res.cloudinary.com/da5yv096f/image/upload/v1715395717/output-onlinepngtools_pbu5c2.png",
          }}
          style={styles.logo}
        />
        <TouchableOpacity
          style={styles.info}
          onPress={() => RootNavigation.navigate("Setting")}
        >
          <Image
            source={{
              uri: "https://res.cloudinary.com/da5yv096f/image/upload/v1690723022/output-onlinegiftools_dsphas.gif",
            }}
            style={styles.avatar}
          />
          <Text>2618 - Đỗ Công Thương</Text>
        </TouchableOpacity>
        <TouchableOpacity>
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
  info: {
    flexDirection: "row",
    alignItems: "center",
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
    marginRight: 10,
  },
});

export default CustomHeader;
