/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab5.exercise1;

/**
 *
 * @author Sergiu
 */
public class Bank {
    private Account[] accounts;

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }
    
    public String executeTransaction(Transaction transaction){
        return transaction.execute();
    }
    public Account getAccountByCardId(String cardId){
        for(Account account:this.accounts){
            if(account.getCard().getCardId().equals(cardId)){
                return account;
            }
        }
        return null;
    }
    
}
