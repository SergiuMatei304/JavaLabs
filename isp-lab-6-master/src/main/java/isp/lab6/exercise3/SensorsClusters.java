/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab6.exercise3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergiu
 */
public class SensorsClusters {
    List<Sensor> sensors= new ArrayList();
    public Sensor addSensor(SENSOR_TYPE type,String sensorId){
        Sensor senzor = new Sensor(type,sensorId);
        sensors.add(senzor);
        return senzor;
    }
    public Sensor getSensorById(String sensorId){
        return sensors.stream().filter(sensortemp -> sensortemp.getId().equals(sensorId)).findFirst().get();
    }
    public boolean writeSensorReading(String sensorId, double value, LocalDateTime dateTime){
        if(getSensorById(sensorId)==null){
            return false;
        }
        getSensorById(sensorId).addSensorReading(dateTime,value);
        return true;
    }

}
