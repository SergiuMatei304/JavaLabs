package isp.lab6.exercise4;

public class CheckMoney extends Transaction{

    public CheckMoney(Account account) {
        super(account);
    }


    @Override
    String execute() {
        return "Your account balance is: " + getAccount().getBalance() + "$";
    }

}

