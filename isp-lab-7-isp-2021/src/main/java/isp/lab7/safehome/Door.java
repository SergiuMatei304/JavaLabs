/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab7.safehome;

/**
 *
 * @author Sergiu
 */
public class Door {
    private DoorStatus status;

    public Door() {
        this.status=DoorStatus.CLOSE;
    }

    public DoorStatus getStatus() {
        return status;
    }

    public void lockDoor(){
        this.status=DoorStatus.CLOSE;
    }
    
    public void unlockDoor(){
        this.status=DoorStatus.OPEN;
    }
}
