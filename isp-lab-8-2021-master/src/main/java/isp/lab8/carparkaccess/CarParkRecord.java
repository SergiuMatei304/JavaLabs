package isp.lab8.carparkaccess;

import java.io.Serializable;
import java.util.Date;

public class CarParkRecord implements Serializable {
    Car c;
    Date beginTime;
    Date endTime;
    public CarParkRecord(Car c) {
        this.c = c;
        this.beginTime = new Date();
    }

}
