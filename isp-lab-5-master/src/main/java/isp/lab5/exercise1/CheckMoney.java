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
public class CheckMoney extends Transaction{

    public CheckMoney(Account account) {
        super(account);
    }
    
    
    @Override
    String execute() {
        return "Your account balance is: " + getAccount().getBalance() + "$"; 
    }
    
}
