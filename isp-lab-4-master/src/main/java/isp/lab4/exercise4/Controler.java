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
public class Controler {
    private TemperatureSensor[] temperatureSensors = new TemperatureSensor[3];
    private FireAlarm fireAlarm;

    public Controler(TemperatureSensor[] temperatureSensors,FireAlarm fireAlarm) {
        this.temperatureSensors=temperatureSensors;
        this.fireAlarm = fireAlarm;
    }
    
    public void controlStep(){
        boolean status=true;
        for(int i=0;i<3;i++){
            if(temperatureSensors[i].getValue()<=50)
                status=false;
        }
        if(status == true){
            this.fireAlarm.setActive(true);
            System.out.println("Fire alarm started");
        }
        else{
            this.fireAlarm.setActive(false);
            System.out.println("Fire alarm not started");
        }
    }
    public static void main(String[] args) {
        
    }
}
