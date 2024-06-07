import { NavigationContainer } from "@react-navigation/native";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import { createNativeStackNavigator } from "@react-navigation/native-stack";
import { navigationRef } from "./components/RootNavigation";
import Ionicons from "react-native-vector-icons/Ionicons";
import Toast from "react-native-toast-message";
import HomeScreen from "./screens/HomeScreen";
import VehicleTypeScreen from "./screens/Vehicle/VehicleTypeScreen";
import VehicleScreen from "./screens/Vehicle/VehicleScreen";
import VehicleTypeSelectionScreen from "./screens/Vehicle/VehicleTypeSelectionScreen";
import DriverScreen from "./screens/Vehicle/DriverScreen";
global.ip = "192.168.1.141";
const Tab = createBottomTabNavigator();
const Stack = createNativeStackNavigator();

function HomeStack() {
  return (
    <Stack.Navigator screenOptions={{ headerShown: false }}>
      <Stack.Screen name="HomeMain" component={HomeScreen} />
      <Stack.Screen name="VehicleType" component={VehicleTypeScreen} />
      <Stack.Screen
        name="VehicleTypeSelection"
        component={VehicleTypeSelectionScreen}
      />
      <Stack.Screen name="Vehicle" component={VehicleScreen} />
      <Stack.Screen name="Driver" component={DriverScreen} />
    </Stack.Navigator>
  );
}
export default function App() {
  return (
    <NavigationContainer ref={navigationRef}>
      <Tab.Navigator
        screenOptions={({ route }) => ({
          headerShown: false,
          tabBarIcon: ({ focused, color, size }) => {
            let iconName = "home";

            if (route.name === "Home") {
              iconName = focused ? "home" : "home-outline";
            } else if (route.name === "Booking") {
              iconName = focused ? "reader" : "reader-outline";
            } else if (route.name === "Setting") {
              iconName = focused ? "settings" : "settings-outline";
            }

            return <Ionicons name={iconName} size={size} color={color} />;
          },
          tabBarActiveTintColor: "blue",
          tabBarInactiveTintColor: "gray",
        })}
      >
        <Tab.Screen name="Home" component={HomeStack} />
        <Tab.Screen name="Booking" component={VehicleScreen} />
        <Tab.Screen name="Setting" component={VehicleScreen} />
      </Tab.Navigator>
      <Toast />
    </NavigationContainer>
  );
}
