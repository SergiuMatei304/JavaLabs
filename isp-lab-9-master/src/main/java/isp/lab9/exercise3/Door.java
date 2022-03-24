package isp.lab9.exercise3;

/**
 * @author Sergiu
 */
public class Door {
    private DoorStatus status;

    public Door() {
        this.status = DoorStatus.CLOSE;
    }

    public DoorStatus getStatus() {
        return status;
    }

    public void lockDoor() {
        this.status = DoorStatus.CLOSE;
    }

    public void unlockDoor() {
        this.status = DoorStatus.OPEN;
    }
}
