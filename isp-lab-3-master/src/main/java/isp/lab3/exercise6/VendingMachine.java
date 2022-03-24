package isp.lab3.exercise6;

public class VendingMachine {
    
    private static volatile VendingMachine instance;
    private VendingMachine() {
        
    }
    public static VendingMachine getInstance(String value) {
        VendingMachine instance = VendingMachine.instance;
        if (instance == null) {
            synchronized (VendingMachine.class) {
                instance = VendingMachine.instance;
                if (instance == null) {
                    VendingMachine.instance = instance = new VendingMachine();
                }
            }
        }
        return instance;
    }
    
    int credit=0;
    public String displayProducts(){
        return "1. Long Coffee \n2. Frappuccino \n3. Hot chocolate \n4. Cappuccino\n5. Tea \n6. Espresso \n7. Long Espresso \n8. Latte \n9. Grand Latte";
    }
    public void insertCoin(int value){
        this.credit+=value;
    }
    public String selectProduct(int id){
        switch(id)
        {
            case 1:
                return "Long Coffee";
            case 2:
                return "Frappuccino";
            case 3:
                return "Hot chocolate";
            case 4:
                return "Cappuccino";
            case 5:
                return "Tea";
            case 6:
                return "Espresso";
            case 7:
                return "Long Espresso";
            case 8:
                return "Latte";
            case 9:
                return "Grand Latte";
            default:
                return "No item available at id: "+id;
        }
    }
    public String displayCredit(){
        return "Vending Machine available credit: " + this.credit;
    }
    
    public String userMenu(){
        return "To see available credit use displayCredit() \nTo see available products use displayProducts()"
                + "\nTo insert credit use insertCoin(value) \nTo select a product use selectProduct(id)";
    }

    public int getCredit() {
        return credit;
    }
    public static void main(String[] args){
        
    }
}
