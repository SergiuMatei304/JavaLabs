package isp.lab6.exercise4;

public class WithdrawMoney extends Transaction{
    public double amount;

    public WithdrawMoney(double amount, Account account) {
        super(account);
        this.amount = amount;
    }


    @Override
    String execute() {
        if(getAccount().getBalance()>=amount){
            getAccount().setBalance(getAccount().getBalance() - amount);
            return "You succesfully withdrawed "+ amount + "$";
        }
        else{
            return "Insufficient funds";
        }
    }

    public double getAmount() {
        return amount;
    }


}

