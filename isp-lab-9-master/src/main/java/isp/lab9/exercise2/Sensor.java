package isp.lab9.exercise2;

import java.util.Random;

public class Sensor extends Observable{
    private SENSOR_TYPE type;
    private double value;

    public Sensor(SENSOR_TYPE type) {

        this.type = type;
        this.value= random.nextDouble();
    }

    Random random = new Random();
    void readSensor(){
        this.value= random.nextDouble();
        changeState(this);
    }

    public SENSOR_TYPE getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public String showValue(){ return String.valueOf(value); }
}
