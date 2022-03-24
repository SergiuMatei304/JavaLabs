package isp.lab6.exercise3;

import java.time.LocalDateTime;

public class Exercise3 {

    public static void main(String[] args) {

        SensorsClusters sensors = new SensorsClusters();
        sensors.addSensor(SENSOR_TYPE.PRESSURE,"1");
        sensors.addSensor(SENSOR_TYPE.PRESSURE,"2");
        sensors.addSensor(SENSOR_TYPE.TEMPERATURE,"3");
        System.out.println();
        System.out.println(sensors.getSensorById("1").toString());
        System.out.println();
        sensors.writeSensorReading("1",2.2, LocalDateTime.now());
        sensors.getSensorById("1").displaySensorReading();
        System.out.println();
        sensors.writeSensorReading("1",3.2, LocalDateTime.now());
        sensors.getSensorById("1").displaySensorReading();
        System.out.println();
        sensors.writeSensorReading("3",5.2, LocalDateTime.now());
        sensors.getSensorById("3").displaySensorReading();
    }
}
