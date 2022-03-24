package isp.lab6.exercise4;

public abstract class Transaction {
    private Account account;
    abstract String execute();

    public Transaction(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

}

