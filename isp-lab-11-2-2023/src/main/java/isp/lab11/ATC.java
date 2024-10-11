package isp.lab11;

import java.util.ArrayList;
import java.util.List;

public class ATC {

    // List to store Aircraft instances
    private List<Aircraft> aircraftList;

    public ATC() {
        this.aircraftList = new ArrayList<>();
    }

    public void addAircraft(String id) {
        // Create an Aircraft instance and add it to the list
        Aircraft aircraft = new Aircraft(id);
        aircraftList.add(aircraft);
        System.out.println("Aircraft with id " + id + " added.");
    }

    public void sendCommand(String id, AtcCommand command) {
        // Find the Aircraft with the given id
        Aircraft aircraft = findAircraftById(id);
        if (aircraft != null) {
            // Send the command to the Aircraft
            aircraft.receiveCommand(command);
            System.out.println("Aircraft with id " + id + " received command " + command);
        } else {
            System.out.println("Aircraft with id " + id + " not found.");
        }
    }

    public void showAircrafts() {
        // Display all Aircrafts
        System.out.println("All Aircrafts:");
        for (Aircraft aircraft : aircraftList) {
            System.out.println("ID: " + aircraft.getId());
        }
    }

    // Helper method to find Aircraft by id
    private Aircraft findAircraftById(String id) {
        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getId().equals(id)) {
                return aircraft;
            }
        }
        return null;
    }
}

class Aircraft {
    private String id;

    public Aircraft(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void receiveCommand(AtcCommand command) {
        System.out.println("Aircraft " + id + " received command: " + command);
    }
}

class AtcCommand {
    private String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }
}
