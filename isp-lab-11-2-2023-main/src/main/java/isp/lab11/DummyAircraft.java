package isp.lab11;

public class DummyAircraft extends Aircraft {

    public DummyAircraft(String id) {
        super(id);
        System.out.println("Aircraft " + id + " is created. Ready to take off.");
    }

    public void start() {
        // Start the aircraft by sending a takeoff command
        TakeoffCommand takeoffCommand = new TakeoffCommand(0); // Assuming initial altitude is 0
        super.receiveCommand(takeoffCommand);
    }
}
public static void main(String[] args) {
    ATC atc = new ATC();

    // Create DummyAircraft instances
    DummyAircraft aircraft1 = new DummyAircraft("1");
    DummyAircraft aircraft2 = new DummyAircraft("2");

    // Add DummyAircraft instances to ATC
    atc.addAircraft(aircraft1.getId());
    atc.addAircraft(aircraft2.getId());

    // Start DummyAircraft instances
    aircraft1.start();
    aircraft2.start();

    // Example: sending a command to aircraft1
    AtcCommand command = new AtcCommand("Some command");
    atc.sendCommand(aircraft1.getId(), command);
}
