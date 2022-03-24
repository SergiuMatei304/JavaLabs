package isp.lab8.carparkaccess;

public class ParkingSpot{
    Car carOnThisSpot;
    int numberOfParkingSpot;

    public ParkingSpot(int numberOfParkingSpot) {
        this.numberOfParkingSpot = numberOfParkingSpot;
    }

    public void putCar(Car c){
        this.carOnThisSpot = c;
    }

    public void removeCar(Car c){ this.carOnThisSpot = null; }

    public boolean isFree(){
        return carOnThisSpot == null;
    }

    public Car getCarOnThisSpot() {
        return carOnThisSpot;
    }
}
