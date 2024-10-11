package isp.lab5.exercise2;

public class SmartWatch {
    private int batteryLevel;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public SmartWatch(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
