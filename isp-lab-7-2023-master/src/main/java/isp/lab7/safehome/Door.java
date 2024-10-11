package isp.lab7.safehome;

public class Door {
    private DoorStatus status;

    public Door() {
        this.status = DoorStatus.CLOSE; // By default, the door is closed
    }

    public DoorStatus getStatus() {
        return status;
    }

    public void setStatus(DoorStatus status) {
        this.status = status;
    }

    public void open() {
        if (status == DoorStatus.CLOSE) {
            System.out.println("Opening the door.");
            status = DoorStatus.OPEN;
        } else {
            System.out.println("The door is already open.");
        }
    }

    public void close() {
        if (status == DoorStatus.OPEN) {
            System.out.println("Closing the door.");
            status = DoorStatus.CLOSE;
        } else {
            System.out.println("The door is already closed.");
        }
    }

    public static void main(String[] args) {
        Door door = new Door();

        System.out.println("Initial door status: " + door.getStatus());

        door.open();
        System.out.println("Door status after opening: " + door.getStatus());

        door.close();
        System.out.println("Door status after closing: " + door.getStatus());
    }
}
