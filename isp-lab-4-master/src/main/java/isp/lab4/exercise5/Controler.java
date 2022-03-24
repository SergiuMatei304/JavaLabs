/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise5;

/**
 *
 * @author Sergiu
 */
public class Controler {
    private TemperatureSensor[] temperatureSensors = new TemperatureSensor[3];
    private FireAlarm fireAlarm;

    public Controler() {
       temperatureSensors[0]=new TemperatureSensor(30,"Front");
       temperatureSensors[1]=new TemperatureSensor(60,"Back");
       temperatureSensors[2]=new TemperatureSensor(40,"Middle");
       fireAlarm= new FireAlarm(false);
    }

    public FireAlarm getFireAlarm() {
        return fireAlarm;
    }

    public void setTemperatureSensors(TemperatureSensor[] temperatureSensors) {
        this.temperatureSensors = temperatureSensors;
    }

    public void setFireAlarm(FireAlarm fireAlarm) {
        this.fireAlarm = fireAlarm;
    }

    
    
    public void controlStep(){
        boolean status=false;
        for(int i=0;i<3;i++){
            if(temperatureSensors[i].getValue()>=50)
                status=true;
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
