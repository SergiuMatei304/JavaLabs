package isp.lab6.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        Card card1 = new Card("1","1234");
        Card card2 = new Card("2","9876");
        Account account0 = new Account("John",1500,card1);
        Account account1 = new Account("Randy",3500,card2);
        Bank bank= new Bank();
        bank.registerInBank(account0);
        bank.registerInBank(account1);
        ATM atm = new ATM(bank);
        System.out.println("");
        atm.insertCard(card1, "1534");
        System.out.println("");
        atm.insertCard(card1, "1234");
        atm.changePin("3333", "3412");
        System.out.println("");
        atm.checkMoney();
        System.out.println("");
        atm.removeCard();
        System.out.println("");
        atm.checkMoney();
        atm.insertCard(card2, "9876");
        System.out.println("");
        atm.checkMoney();
        System.out.println("");
        atm.changePin("9876", "5678");
        System.out.println("");
        atm.withdraw(5000);
        System.out.println("");
        atm.withdraw(1000);
        System.out.println("");
        atm.checkMoney();

    }
}
