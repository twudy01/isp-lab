package isp.lab6.exercise2;
import java.util.HashSet;
public class VehicleManager {
    private HashSet<Vehicle> vehicles;
    public VehicleManager(HashSet<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    public boolean addVehicle(Vehicle vehicle) {
        return vehicles.add(vehicle);
    }
    public boolean removeVehicle(Vehicle vehicle) {
        return vehicles.remove(vehicle);
    }

    public void displayAllVehicles() {
        System.out.println("All vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
    private void checkVIN(String VIN){
    }
}
