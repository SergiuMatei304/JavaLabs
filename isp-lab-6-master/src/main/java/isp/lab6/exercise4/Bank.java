package isp.lab6.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts=new ArrayList<>();

    public void registerInBank(Account account){
        accounts.add(account);
    }

    public String executeTransaction(Transaction transaction){
        return transaction.execute();
    }
    public Account getAccountByCardId(String cardId){
        for(Account account:accounts){
            if(account.getCard().getCardId().equals(cardId)){
                return account;
            }
        }
        return null;
    }

}
