/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab8.carparkaccess;

/**
 *
 * @author Sergiu
 */
public class Car {
    public String plate;
    public int numberOfEntries;

    public Car(String plate) {
        this.plate = plate;
        this.numberOfEntries=0;
    }

    public String getPlate() {
        return plate;
    }

    public void carEntry(){
        numberOfEntries++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", numberOfEntries=" + numberOfEntries +
                '}';
    }
}
