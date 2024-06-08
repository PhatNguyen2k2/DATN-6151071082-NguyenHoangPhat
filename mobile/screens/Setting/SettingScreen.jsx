import React, { useState } from "react";
import {
  View,
  Text,
  StyleSheet,
  Image,
  Switch,
  Button,
  Alert,
  Modal,
  Pressable,
  ScrollView,
} from "react-native";
import CustomHeader from "../../components/CustomHeader";

const SettingScreen = () => {
  const [isDarkMode, setIsDarkMode] = useState(false);
  const [isNotificationsEnabled, setIsNotificationsEnabled] = useState(true);
  const [showOptionsModal, setShowOptionsModal] = useState(false);
  const [selectedOption, setSelectedOption] = useState(null);

  const handleOptionPress = (option) => {
    setSelectedOption(option);
    setShowOptionsModal(true);
  };

  const handleConfirmAction = () => {
    if (selectedOption === "changePassword") {
      Alert.alert(
        "Đổi Mật Khẩu",
        "Tính năng đổi mật khẩu chưa được triển khai."
      );
    } else if (selectedOption === "deleteAccount") {
      Alert.alert(
        "Xóa Tài Khoản",
        "Tính năng xóa tài khoản chưa được triển khai."
      );
    }
    setShowOptionsModal(false);
  };

  return (
    <>
      <CustomHeader title="Setting" />
      <ScrollView style={styles.container}>
        <View style={styles.header}>
          <Image
            source={{
              uri: "https://res.cloudinary.com/da5yv096f/image/upload/v1690723022/output-onlinegiftools_dsphas.gif",
            }}
            style={styles.avatar}
          />
          <Text style={styles.userName}>2618 - Đỗ Công Thương</Text>
          <Text style={styles.partner}>
            Công ty TNHH MTV Dịch vụ Vận tải Vương Huy
          </Text>
        </View>

        <View style={styles.separator} />

        <Text style={styles.sectionTitle}>Cài Đặt</Text>
        <View style={styles.settingItem}>
          <Text style={styles.label}>Ngôn Ngữ:</Text>
          <Text style={styles.value}>Tiếng Việt</Text>
        </View>
        <View style={styles.settingItem}>
          <Text style={styles.label}>Chế Độ Ban Đêm:</Text>
          <Switch value={isDarkMode} onValueChange={setIsDarkMode} />
        </View>
        <View style={styles.settingItem}>
          <Text style={styles.label}>Thông Báo:</Text>
          <Switch
            value={isNotificationsEnabled}
            onValueChange={setIsNotificationsEnabled}
          />
        </View>
        <View style={styles.settingItem}>
          <Text style={styles.label}>Phiên Bản Ứng Dụng:</Text>
          <Text style={styles.value}>1.0.0</Text>
        </View>

        <View style={styles.separator} />

        <Text style={styles.sectionTitle}>Thông Tin Người Dùng</Text>
        <View style={styles.settingItem}>
          <Text style={styles.label}>Tên:</Text>
          <Text style={styles.value}>Đỗ Công Thương</Text>
        </View>
        <View style={styles.settingItem}>
          <Text style={styles.label}>Email:</Text>
          <Text style={styles.value}>thuongdo@gmail.com</Text>
        </View>
        <View style={styles.settingItem}>
          <Text style={styles.label}>Số Điện Thoại:</Text>
          <Text style={styles.value}>0923656539</Text>
        </View>

        <View style={styles.separator} />

        <Text style={styles.sectionTitle}>Tài khoản</Text>
        <View style={styles.settingItem}>
          <Pressable
            style={styles.optionButton}
            onPress={() => handleOptionPress("changePassword")}
          >
            <Text style={styles.option}>Đổi Mật Khẩu</Text>
          </Pressable>
        </View>
        <View style={styles.settingItem}>
          <Pressable
            style={[styles.optionButton, { backgroundColor: "red" }]}
            onPress={() => handleOptionPress("deleteAccount")}
          >
            <Text style={styles.option}>Xóa Tài Khoản</Text>
          </Pressable>
        </View>

        <Modal
          animationType="slide"
          transparent={true}
          visible={showOptionsModal}
          onRequestClose={() => setShowOptionsModal(false)}
        >
          <View style={styles.modalContainer}>
            <View style={styles.modalContent}>
              <Text style={styles.modalTitle}>
                {selectedOption === "changePassword"
                  ? "Đổi Mật Khẩu"
                  : "Xóa Tài Khoản"}
              </Text>
              <Text style={styles.modalDescription}>
                {selectedOption === "changePassword"
                  ? "Bạn có chắc chắn muốn đổi mật khẩu không?"
                  : "Bạn có chắc chắn muốn xóa tài khoản không?"}
              </Text>
              <View style={styles.modalActions}>
                <Pressable
                  style={styles.modalActionButton}
                  onPress={() => setShowOptionsModal(false)}
                >
                  <Text style={styles.modalActionText}>Hủy</Text>
                </Pressable>
                <Pressable
                  style={styles.modalActionButton}
                  onPress={handleConfirmAction}
                >
                  <Text
                    style={[
                      styles.modalActionText,
                      {
                        color:
                          selectedOption === "deleteAccount" ? "red" : "green",
                      },
                    ]}
                  >
                    Xác Nhận
                  </Text>
                </Pressable>
              </View>
            </View>
          </View>
        </Modal>
      </ScrollView>
    </>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
  },
  header: {
    alignItems: "center",
    marginBottom: 20,
  },
  avatar: {
    width: 100,
    height: 100,
    borderRadius: 50,
    marginBottom: 10,
  },
  userName: {
    fontSize: 20,
    fontWeight: "bold",
    color: "#333",
  },
  partner: {
    color: "#666",
  },
  sectionTitle: {
    fontSize: 20,
    fontWeight: "bold",
    marginBottom: 10,
    color: "#333",
  },
  settingItem: {
    flexDirection: "row",
    alignItems: "center",
    marginBottom: 15,
  },
  label: {
    width: 150,
    fontWeight: "bold",
    color: "#555",
  },
  value: {
    flex: 1,
    color: "#333",
  },
  separator: {
    borderBottomWidth: 1,
    borderBottomColor: "#ddd",
    marginVertical: 15,
  },
  optionButton: {
    paddingVertical: 10,
    paddingHorizontal: 20,
    borderRadius: 5,
    backgroundColor: "green",
  },
  option: {
    color: "white",
    fontWeight: "bold",
  },
  modalContainer: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "rgba(0, 0, 0, 0.5)",
  },
  modalContent: {
    backgroundColor: "white",
    padding: 20,
    borderRadius: 10,
    elevation: 5,
  },
  modalTitle: {
    fontSize: 18,
    fontWeight: "bold",
    marginBottom: 10,
    textAlign: "center",
  },
  modalDescription: {
    fontSize: 16,
    marginBottom: 20,
    textAlign: "center",
  },
  modalActions: {
    flexDirection: "row",
    justifyContent: "center",
  },
  modalActionButton: {
    marginHorizontal: 10,
    paddingVertical: 10,
  },
  modalActionText: {
    fontSize: 16,
    fontWeight: "bold",
  },
});

export default SettingScreen;
