package isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
      TemperatureSensor sensor1= new TemperatureSensor(30,"Front");
      FireAlarm alarm1= new FireAlarm(false);
      Controler controler1= new Controler(sensor1,alarm1);  
      controler1.controlStep();
      TemperatureSensor sensor2= new TemperatureSensor(60,"Back");
      FireAlarm alarm2= new FireAlarm(false);
      Controler controler2= new Controler(sensor2,alarm2);  
      controler2.controlStep();
    }
    
}
