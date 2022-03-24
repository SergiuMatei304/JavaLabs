package isp.lab3.exercise3;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fueltype;
    private static int numberofcars=0;
    public Vehicle(String model, String type, int speed, char fueltype) {
        this.model = model;
        this.type = type;
        this.speed=speed;
        this.fueltype=fueltype;
        numberofcars++;
    }
    
    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public char getFueltype() {
        return fueltype;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFueltype(char fueltype) {
        this.fueltype = fueltype;
    }
    
    public static int getVehiclesNumber(){
        return numberofcars;
    }
    /**
     *
     * @return
     */
    @Override 
     public String toString(){
        return model+" ("+type+") speed "+speed+" fuel type "+fueltype;
    }
     public static void main(String args[]){
         Vehicle car1= new Vehicle("Renault","Megane",180,'D');
         Vehicle car2= new Vehicle("Ferrari","430",300,'B');
         System.out.println("Primul model de masina este: "+car1.getModel() +
                 "\nTipul primei masini este: "+car1.getType() +
                 "\nViteza maxima la prima masina este: "+ car1.getSpeed()+
                 "\nTipul combustibilului la prima masina este: "+ car1.getFueltype());
         System.out.println("Al doilea model de masina este: "+car2.getModel() +
                 "\nTipul celei de-a doua masini este: "+car2.getType() +
                 "\nViteza maxima la a doua masina este: "+ car2.getSpeed()+
                 "\nTipul combustibilului la a doua masina este: "+ car2.getFueltype());
         car1.setModel("VW");
         car1.setType("Passat");
         car1.setSpeed(190);
         car1.setFueltype('D');
         car2.setModel("Opel");
         car2.setType("Vectra");
         car2.setSpeed(200);
         car2.setFueltype('B');
         System.out.println("\nPrima masina :" + car1 + "\nA doua masina: "+ car2);
         if(car1.equals(car2)){
             System.out.println("\nMasinile sunt la fel");
         }
         else{
             System.out.println("\nMasinile sunt diferite");
         }
         System.out.println("\nNumarul de obiecte create: "+ getVehiclesNumber());
     }
}
