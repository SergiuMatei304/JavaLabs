package isp.lab8.carparkaccess;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

public class CarParkingAccessApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        CarParkingControl controller = new CarParkingControl(2);
        System.out.println("It works!");
    }
}
