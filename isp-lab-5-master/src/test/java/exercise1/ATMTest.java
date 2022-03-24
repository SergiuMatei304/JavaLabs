/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import isp.lab5.exercise1.ATM;
import isp.lab5.exercise1.Account;
import isp.lab5.exercise1.Bank;
import isp.lab5.exercise1.Card;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sergiu
 */
public class ATMTest {
    @Test
    public void testchangePIN(){
        Account[] accounts = new Account[2];
        Card card1 = new Card("1","1234");
        Card card2 = new Card("2","9876");
        accounts[0] = new Account("John",1500,card1);
        accounts[1] = new Account("Randy",3500,card2);
        Bank bank= new Bank(accounts);
        ATM atm = new ATM(bank);
        atm.insertCard(card1, "1234");
        atm.changePin("3333", "3412");
        assertEquals(atm.getCard().getPin(),"1234");
        atm.changePin("1234", "5678");
        assertEquals(atm.getCard().getPin(),"5678");
    }
    @Test
    public void testWithdraw(){
        Account[] accounts = new Account[2];
        Card card1 = new Card("1","1234");
        Card card2 = new Card("2","9876");
        accounts[0] = new Account("John",1500,card1);
        accounts[1] = new Account("Randy",3500,card2);
        Bank bank= new Bank(accounts);
        ATM atm = new ATM(bank);
        atm.insertCard(card1, "1234");
        atm.withdraw(5000);
        assertEquals(1500.0,accounts[0].getBalance(),0.001);
        atm.withdraw(1000);
        assertEquals(500.0,accounts[0].getBalance(),0.001);
    }
    @Test
    public void testinsertCard(){
       Account[] accounts = new Account[2];
        Card card1 = new Card("1","1234");
        Card card2 = new Card("2","9876");
        accounts[0] = new Account("John",1500,card1);
        accounts[1] = new Account("Randy",3500,card2);
        Bank bank= new Bank(accounts);
        ATM atm = new ATM(bank);
        assertEquals("This should be true",true,atm.insertCard(card1, "1234"));
        assertEquals("This should be false",false,atm.insertCard(card1, "4321"));
    }
}
