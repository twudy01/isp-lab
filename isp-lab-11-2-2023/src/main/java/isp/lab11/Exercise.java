package isp.lab11;

import java.util.Scanner;

public class Exercise {
    static DummyAircraft dummyAircraft = null;

    public static void displayMenu(ATC atc) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("Welcome to Airtraffic Control System command center");
        System.out.println("1. Add aircraft");
        System.out.println("2. Take off command");
        System.out.println("3. Land command");
        System.out.println("4. Show aircrafts");
        System.out.println("5. Exit");

        System.out.print("Enter your command: ");
        String command = scanner.nextLine();
        String aid = null;

        switch (command) {
            case "1":
                System.out.print("Enter aircraft id: ");
                aid = scanner.nextLine();
                atc.addAircraft(aid);
                dummyAircraft = new DummyAircraft(aid); // Create DummyAircraft instance
                break;
            case "2":
                if (dummyAircraft != null) {
                    System.out.print("Send take off command to aircraft id: ");
                    aid = scanner.nextLine();
                    if (aid.equals(dummyAircraft.getId())) {
                        atc.sendCommand(aid, new AtcCommand("take off"));
                        dummyAircraft.start(); // Start the DummyAircraft
                    } else {
                        System.out.println("Invalid aircraft id.");
                    }
                } else {
                    System.out.println("No aircraft added yet.");
                }
                break;
            case "3":
                if (dummyAircraft != null) {
                    System.out.print("Send land command to aircraft id: ");
                    aid = scanner.nextLine();
                    if (aid.equals(dummyAircraft.getId())) {
                        atc.sendCommand(aid, new AtcCommand("land"));
                        dummyAircraft.land(); // Land the DummyAircraft
                    } else {
                        System.out.println("Invalid aircraft id.");
                    }
                } else {
                    System.out.println("No aircraft added yet.");
                }
                break;
            case "4":
                atc.showAircrafts();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid command.");
        }
    }

    public static void main(String[] args) {
        ATC atc = new ATC();
        while (true) {
            displayMenu(atc);
        }
    }
}
