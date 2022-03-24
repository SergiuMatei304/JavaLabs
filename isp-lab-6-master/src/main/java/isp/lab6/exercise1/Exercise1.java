package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Test implementation here.");
        List<SensorReading> sensorList = new ArrayList<SensorReading>(); 
        ReadingRepository repo = new ReadingRepository();
        SensorReading senzor1 = new SensorReading(10,"Front",Type.TEMPERATURE);
        SensorReading senzor2 = new SensorReading(20,"Back",Type.PRESSURE);
        SensorReading senzor3 = new SensorReading(30,"Middle",Type.PRESSURE);
        SensorReading senzor4 = new SensorReading(40,"Front",Type.HUMIDITY);
        repo.addReading(senzor1);
        repo.addReading(senzor2);
        repo.addReading(senzor3);
        repo.addReading(senzor4);
        repo.listSortedByLocation();
        repo.showList();
        System.out.println("");
        repo.listSortedByValue();
        repo.showList();
    }
}
