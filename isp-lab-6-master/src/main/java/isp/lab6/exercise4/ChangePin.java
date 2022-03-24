package isp.lab6.exercise4;

public class ChangePin extends Transaction{
    public String oldPin;
    public String newPin;

    public ChangePin(String oldPin, String newPin, Account account) {
        super(account);
        this.oldPin = oldPin;
        this.newPin = newPin;
    }



    @Override
    String execute() {
        if(!getAccount().getCard().getPin().equals(oldPin)){
            return "You can't change the PIN";
        }
        else{
            getAccount().getCard().setPin(newPin);
            return "You changed the PIN succesfully";
        }
    }
}
