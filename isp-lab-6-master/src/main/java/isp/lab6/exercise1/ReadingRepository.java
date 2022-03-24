/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Sergiu
 */
public class ReadingRepository implements IReadingRepository{
    List<SensorReading> readings = new ArrayList<SensorReading>();
    
    @Override
    public void addReading(SensorReading reading) {
        readings.add(reading);
    }

    @Override
    public double getAvarageValueByType(Type type, String location) {
        List<SensorReading> filteredList = new ArrayList<SensorReading>();
        for(SensorReading reading: readings){
            if(reading.getType().equals(type) && reading.getType().equals(location)){
                filteredList.add(reading);
            }
        }
        double sum =0;
        for(SensorReading reading : filteredList){
            sum+=reading.getValue();
        }
        sum = sum / filteredList.size();
        return sum;
    }
    
    public void showList(){
        for(SensorReading reading: readings){
            System.out.println("Value:"+reading.getValue()+" Location:"+reading.getLocation()+" Type:"+reading.getType());
        }
    }
    
    @Override
    public List<SensorReading> getReadingsByType(Type type) {
          /*List<SensorReading> readingsByType = new ArrayList<>();
          for(SensorReading reading: readings){
              if(reading.getType().equals(type)){
                  readingsByType.add(reading);
              }
          }
          return readingsByType;*/
          return readings.stream().filter(temp -> temp.getType().equals(type)).collect(Collectors.toList());
    }

    @Override
    public void listSortedByLocation() {
        readings.sort(Comparator.comparing(SensorReading::getLocation));
    }

    @Override
    public void listSortedByValue() {
        readings.sort(Comparator.comparing(SensorReading::getValue));
    }

    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type) {
        return readings.stream().filter(temp -> temp.getLocation().equals(location)).filter(temp2 -> temp2.getType().equals(type)).collect(Collectors.toList());
    }
    
}
