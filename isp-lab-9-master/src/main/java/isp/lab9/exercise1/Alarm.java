package isp.lab9.exercise1;

class Alarm extends Observable {
    void startAlarm() {
        System.out.println("Alarm has been started!");
        this.changeState("START");
    }

    void stopAlarm() {
        System.out.print("Alarm has been stopped!");
        this.changeState("STOP");
    }
}
