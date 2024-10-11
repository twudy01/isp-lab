package isp.lab7.safehome;

import java.util.ArrayList;
import java.util.List;

public class DoorLockController {
    private boolean validAccess;
    private List<String> accessLogs;
    private List<String> tenants;

    public DoorLockController() {
        this.validAccess = false;
        this.accessLogs = new ArrayList<>();
        this.tenants = new ArrayList<>();
    }

    // Method to enter PIN and check access
    public void enterPin(String pin) {
        if (pin.equals("1234")) {
            validAccess = true;
            accessLogs.add("Access granted at " + System.currentTimeMillis());
            System.out.println("Access granted.");
        } else {
            validAccess = false;
            accessLogs.add("Access denied at " + System.currentTimeMillis());
            System.out.println("Access denied.");
        }
    }

    // Method to add a tenant
    public void addTenant(String tenant) {
        tenants.add(tenant);
        System.out.println("Tenant added: " + tenant);
    }

    // Method to remove a tenant
    public void removeTenant(String tenant) {
        if (tenants.remove(tenant)) {
            System.out.println("Tenant removed: " + tenant);
        } else {
            System.out.println("Tenant not found.");
        }
    }

    // Method to get access logs
    public List<String> getAccessLogs() {
        return accessLogs;
    }

    public static void main(String[] args) {
        DoorLockController doorLockController = new DoorLockController();

        // Test adding tenants
        doorLockController.addTenant("John");
        doorLockController.addTenant("Alice");

        // Test entering PIN
        doorLockController.enterPin("1234"); // Access granted
        doorLockController.enterPin("5678"); // Access denied

        // Test removing tenant
        doorLockController.removeTenant("John");

        // Test getting access logs
        List<String> logs = doorLockController.getAccessLogs();
        System.out.println("Access logs:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}

