/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise5;

/**
 *
 * @author Sergiu
 */
public class FireAlarm {
    private boolean active;

    public FireAlarm(boolean active) {
        this.active = active;
    }
    
    public boolean isActive(){
        return this.active;
    }
    
    public void setActive(boolean active){
        this.active=active;
    }

    @Override
    public String toString() {
        return "FireAlarm(" + active + ')';
    }
    
    public static void main(String[] args) {

    }
}
