package isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        Controler controler=new Controler();
        House house=new House(controler);
        house.getControler().controlStep();
    }
}
