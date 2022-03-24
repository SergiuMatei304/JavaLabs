package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FireAlarm alarm= new FireAlarm(false);
        System.out.println("Status:" +alarm.toString());
        alarm.setActive(true);
        System.out.println("Status:" +alarm.toString());
        if(alarm.isActive()){
            System.out.println("\n Alarma este activa");
        }
        else{
            System.out.println("\n Alarma nu este activa");
        }
    }
}
