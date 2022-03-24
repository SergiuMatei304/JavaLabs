/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab8.carparkaccess;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergiu
 */
public class CarParking {
    
    List<ParkingSpot> parkingSpots;
    public CarParking(int numberOfParkingSpots){
        this.parkingSpots = new ArrayList();
        for(int i=0;i<numberOfParkingSpots;i++){
            this.parkingSpots.add(new ParkingSpot(i));
        }
    }
    public boolean hasFreeSpot(){
        for(ParkingSpot spot: parkingSpots){
            if(spot.isFree()){
                return true;
            }
        }
        return false;
    }
    
    public void addCar(Car c){
        for(ParkingSpot spot: parkingSpots){
            if(spot.isFree()){
                spot.putCar(c);
            }
        }
    }

    public boolean searchCarByPlate(String plate){
        for(ParkingSpot spot: parkingSpots){
            if(!spot.isFree()){
                if(spot.getCarOnThisSpot().getPlate().equals(plate)){
                    return true;
                }
            }
        }
        return false;
    }

    public void removeCar(Car c){
        for(ParkingSpot spot: parkingSpots){
            if(!spot.isFree()){
                if(spot.getCarOnThisSpot().getPlate().equals(c.getPlate())){
                    spot.removeCar(c);
                }
            }
        }
    }
}


