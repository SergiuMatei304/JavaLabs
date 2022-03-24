package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        TemperatureSensor sensor1= new TemperatureSensor();
        TemperatureSensor sensor2= new TemperatureSensor(15,"Front");
        System.out.println(sensor1.toString());
        System.out.println(sensor2.toString());
        System.out.println("Value for first sensor:"+sensor1.getValue());
        System.out.println("Location for second sensor:"+sensor2.getLocation());
    }
}
