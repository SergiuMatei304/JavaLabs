/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab6.exercise3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Sergiu
 */
public class Sensor implements Comparator {
    private SENSOR_TYPE type;
    private String id;
    List<SensorReading> sensorsReading = new ArrayList();
    public Sensor(SENSOR_TYPE type, String id) {
        this.type = type;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void addSensorReading(LocalDateTime dateAndTime, double value){
        sensorsReading.add(new SensorReading(dateAndTime,value));
    }

    public void displaySensorReading(){
        if(sensorsReading.isEmpty()){
            return;
        }
        SensorReading reading = sensorsReading.get(sensorsReading.size()-1);
        System.out.println("Value:"+ reading.getValue() + "Date: "+reading.getDateAndTime());
    }
    @Override
    public String toString() {
        return "Sensor{" +
                "type=" + type +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
