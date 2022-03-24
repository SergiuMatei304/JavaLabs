package isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
       TemperatureSensor[] temperatureSensors= new TemperatureSensor[3];
       temperatureSensors[0]=new TemperatureSensor(60,"Front");
       temperatureSensors[1]=new TemperatureSensor(60,"Back");
       temperatureSensors[2]=new TemperatureSensor(60,"Middle");
       FireAlarm alarm= new FireAlarm(false);
       Controler control=new Controler(temperatureSensors,alarm);
       control.controlStep();
    }
}
