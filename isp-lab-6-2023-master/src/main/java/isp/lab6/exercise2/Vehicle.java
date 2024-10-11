package isp.lab6.exercise2;
public class Vehicle {
    private String license_plate;
    private String make;
    private String model;
    private int year;
    private int VIN;
    public String getLicense_plate() {
        return license_plate;
    }
    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getVIN() {
        return VIN;
    }
    public void setVIN(int VIN) {
        this.VIN = VIN;
    }
    public Vehicle(String license_plate, String make, String model, int year, int VIN) {
        this.license_plate = license_plate;
        this.make = make;
        this.model = model;
        this.year = year;
        this.VIN = VIN;
    }
}

 