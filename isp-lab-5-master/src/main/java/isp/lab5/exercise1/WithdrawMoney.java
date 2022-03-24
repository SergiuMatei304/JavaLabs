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
