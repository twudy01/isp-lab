package isp.lab5.exercise2;

public class SmartPhone {
    private int batteryLevel;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public SmartPhone(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
