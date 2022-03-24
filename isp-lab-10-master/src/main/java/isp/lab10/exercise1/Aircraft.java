package isp.lab10.exercise1;

import javax.swing.*;


public class Aircraft extends Thread{

    private String id;
    private int altitude;
    private String aircraftStatus="ON STAND";
    private boolean status=true;

    public Aircraft(String id){
        this.id=id;
        this.altitude=0;
    }

    public String getAircraftId() {
        return id;
    }

    public void receiveAtcCommand(AtcCommand msg){
        if(msg instanceof TakeoffCommand){
            this.altitude=((TakeoffCommand) msg).getAltitude();
            synchronized (this){
                this.notify();
            }
        }
        else {
            if(msg instanceof LandCommand){
                synchronized (this) {
                    this.notify();
                }
            }
        }
    }

    @Override
    public void run() {
        long startTime=0,endTime=0,cruisingTime=0;
        while (status) {
            switch (aircraftStatus) {
                case "ON STAND": {
                    try {
                        synchronized (this) {
                            this.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    aircraftStatus= "TAXING";
                }
                break;
                case "TAXING": {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    aircraftStatus="TAKING OFF";
                }
                break;
                case "TAKING OFF":{
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    aircraftStatus="ASCENDING";
                }
                break;
                case "ASCENDING":{
                    try {
                        Thread.sleep((altitude*10000)/1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    aircraftStatus="CRUISING";
                }
                break;
                case "CRUISING":{
                    try {
                        synchronized (this) {
                            startTime = System.nanoTime();
                            this.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    endTime = System.nanoTime();
                    cruisingTime  = endTime-startTime;
                    System.out.println("Cruising time for aircraft "+this.getId()+""+ cruisingTime);
                    aircraftStatus="DESCENDING";
                }
                break;
                case "DESCENDING":{
                    try {
                        Thread.sleep((altitude*10000)/1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    aircraftStatus="LANDED";
                }
                break;
                case "LANDED":{
                    status=false;
                }
            }
        }
    }
    public boolean getAircraftStatus(){
        return status;
    }
    public String showStatus(){
        return aircraftStatus;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id='" + id + '\'' +
                ", altitude=" + altitude +
                ", aircraftStatus='" + aircraftStatus + '\'' +
                "}\n";
    }
}