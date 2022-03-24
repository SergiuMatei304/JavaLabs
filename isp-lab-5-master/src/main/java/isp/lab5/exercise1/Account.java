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
public class Account {
    private String owner;
    private double balance;
    private Card card;

    public Account(String owner, double balance, Card card) {
        this.owner = owner;
        this.balance = balance;
        this.card = card;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public Card getCard() {
        return card;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "Account{" + "owner=" + owner + ", balance=" + balance + ", card=" + card + '}';
    }
    
    
    
}
