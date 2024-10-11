package isp.lab5.exercise2;

import java.awt.datatransfer.StringSelection;

/**
 * @author Radu Miron
 */
public interface Chargeable {
    void charge(int duration);

    int getBatteryLevel();

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("30");
        
    }
}
