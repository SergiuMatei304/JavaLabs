package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        Employee employee1= new Employee("Sergiu","Matei");
        System.out.println("First employee: " + employee1.getPaymentAmount());
        ComissionEmployee employee2= new ComissionEmployee(10.2,22.5,"Ionut","Sarbu");
        System.out.println("Second employee: " + employee2.getPaymentAmount());
        HourlyEmployee employee3= new HourlyEmployee(1100,77.5,"Catalin","Silaghi");
        System.out.println("Third employee: " + employee3.getPaymentAmount());
        SalariedEmployee employee4= new SalariedEmployee(800,"Ionel","Bolba");
        System.out.println("Fourth employee: " + employee4.getPaymentAmount());
        Employee[] vectemployee=new Employee[6];
        vectemployee[0]=new ComissionEmployee(11.1,534.2,"George","Russel"); 
        vectemployee[1]=new ComissionEmployee(75.54,100,"Lewis","Hamilton"); 
        vectemployee[2]=new SalariedEmployee(10000,"Mick","Schumaher"); 
        vectemployee[3]=new SalariedEmployee(5324.3,"Sergio","Perez"); 
        vectemployee[4]=new HourlyEmployee(100,50.5,"John","Cena"); 
        vectemployee[5]=new HourlyEmployee(30,10.5,"John","Wick"); 
        double totalpayment=0;
        for(int i=0;i<6;i++){
            totalpayment+=vectemployee[i].getPaymentAmount();
        }
        System.out.println("Total payment is: " + totalpayment);
    }
}
