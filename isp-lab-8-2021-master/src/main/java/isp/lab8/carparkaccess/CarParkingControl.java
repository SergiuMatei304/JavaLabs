/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab8.carparkaccess;

import java.io.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sergiu
 */
public class CarParkingControl {
    private CarParking parking;
    private List<CarParkRecord> currentLog;
    private int numberOfSpots;
    private int numberOfCarsInPark;

    public CarParkingControl(int numberOfSpots) throws IOException, ClassNotFoundException {
        this.currentLog = readFromFile();
        this.numberOfSpots = numberOfSpots;
        this.numberOfCarsInPark = 0;
    }

    public List<CarParkRecord> readFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream( new FileInputStream("D:\\Faculta\\isp-labs-main-Matei-Sergiu-Florin-30126\\isp-lab-8-2021-master\\docs\\CarParking.txt"));
        List<CarParkRecord> x = (List<CarParkRecord>)in.readObject();
        in.close();
        return x;
    }
    public boolean enterCar(Car c) throws IOException{
        if(numberOfCarsInPark == numberOfSpots){
            System.out.println("No free parking spot");
            return false;
        }else {
            if (parking.hasFreeSpot()) {
                if (!parking.searchCarByPlate(c.getPlate())) {
                    parking.addCar(c);
                    numberOfCarsInPark++;
                    currentLog.add(new CarParkRecord(c));
                    rewriteLog();
                } else {
                    System.out.println("Access denied!");
                    return false;
                }
            }
        }
        return false;
    }
    
    public int exitCar(Car c){
        parking.removeCar(c);
        return -1;
    }
    
    private void rewriteLog() throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\Faculta\\isp-labs-main-Matei-Sergiu-Florin-30126\\isp-lab-8-2021-master\\docs\\CarParking.txt"));
        out.writeObject(currentLog);
    }
}

