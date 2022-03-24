/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab6.exercise3;

import java.time.LocalDateTime;

/**
 *
 * @author Sergiu
 */
public class SensorReading  implements Comparable{
    private LocalDateTime dateAndTime;
    private double value;

    public SensorReading(LocalDateTime dateAndTime, double value) {
        this.dateAndTime = dateAndTime;
        this.value = value;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public double getValue() {
        return value;
    }
    
    @Override
    public int compareTo(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
