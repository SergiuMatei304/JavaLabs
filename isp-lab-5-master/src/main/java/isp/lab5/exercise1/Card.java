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
public class Card {
    private String cardId;
    private String pin;

    public Card(String cardId, String pin) {
        this.cardId = cardId;
        this.pin = pin;
    }

    public String getCardId() {
        return cardId;
    }

    public String getPin() {
        return pin;
    }

    public void setCardld(String cardId) {
        this.cardId = cardId;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
}
