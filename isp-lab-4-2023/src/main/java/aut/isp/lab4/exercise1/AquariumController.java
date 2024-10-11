package aut.isp.lab4.exercise1;

public class AquariumController {

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    //constructors

    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                '}';
    }

    //methods
}
