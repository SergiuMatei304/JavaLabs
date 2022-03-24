package isp.lab6.exercise4;

public class ATM {
    private Card card;
    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public Card getCard() {
        return card;
    }


    public void changePin(String oldPin,String newPin){
        if(card != null){
            Transaction transacion = new ChangePin(oldPin,newPin,bank.getAccountByCardId(card.getCardId()));
            System.out.println(bank.executeTransaction(transacion));
        }
        else{
            System.out.println("Insert card first!");
        }

    }
    public void withdraw(double amount){
        if(card != null){
            Transaction transacion = new WithdrawMoney(amount,bank.getAccountByCardId(card.getCardId()));
            System.out.println(bank.executeTransaction(transacion));
        }
        else{
            System.out.println("Insert card first!");
        }
    }
    public void checkMoney(){
        if(card != null){
            Transaction transacion = new CheckMoney(bank.getAccountByCardId(card.getCardId()));
            System.out.println(bank.executeTransaction(transacion));
        }
        else{
            System.out.println("Insert card first!");
        }
    }
    public boolean insertCard(Card card,String pin){
        if(this.card == null){
            if(card.getPin().equals(pin)){
                this.card=card;
                return true;
            }
            else{
                System.out.println("Wrong PIN");
            }
        }
        return false;
    }
    public void removeCard(){
        this.card=null;
        System.out.println("Card removed succesfully");
    }
}
