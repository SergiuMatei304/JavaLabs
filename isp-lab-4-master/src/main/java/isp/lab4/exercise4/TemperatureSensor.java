/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise4;

/**
 *
 * @author Sergiu
 */
public class TemperatureSensor {
    private int value;
    private String location;

    public TemperatureSensor() {
        
    }

    public TemperatureSensor(int value, String location) {
        this.value = value;
        this.location = location;
    }
    
    public int getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "TemperatureSensor(" + value + ", " + location + ')';
    }
    
    public static void main(String[] args) {

    }
}
