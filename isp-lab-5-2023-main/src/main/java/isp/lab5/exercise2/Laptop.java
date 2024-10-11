package isp.lab5.exercise2;

public class Laptop {
    private int batteryLevel;

    public Laptop(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void charge(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
