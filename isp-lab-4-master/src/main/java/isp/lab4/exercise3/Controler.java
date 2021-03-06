/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise3;

/**
 *
 * @author Sergiu
 */
public class Controler {
    private TemperatureSensor temperatureSensor;
    private FireAlarm fireAlarm;

    public Controler(TemperatureSensor temperatureSensor, FireAlarm fireAlarm) {
        this.temperatureSensor = temperatureSensor;
        this.fireAlarm = fireAlarm;
    }
    
    
    public void controlStep(){
        if(this.temperatureSensor.getValue()<50){
            this.fireAlarm.setActive(false);
            System.out.println("Fire alarm not started");
        }
        else{
            this.fireAlarm.setActive(true);
            System.out.println("Fire alarm started");
        }
    }
}
