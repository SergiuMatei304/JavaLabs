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
