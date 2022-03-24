package isp.lab9.exercise4;

import isp.lab9.exercise2.SENSOR_TYPE;
import isp.lab9.exercise2.Sensor;

public class Model {
    private Sensor temperatureSensor;
    private Sensor humiditySensor;
    private Sensor pressureSensor;

    public Model() {
        this.humiditySensor = new Sensor(SENSOR_TYPE.HUMIDITY);
        this.pressureSensor = new Sensor(SENSOR_TYPE.PRESSURE);
        this.temperatureSensor = new Sensor(SENSOR_TYPE.TEMPERATURE);

    }

    public void setTemperatureSensor(Sensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    public void setHumiditySensor(Sensor humiditySensor) {
        this.humiditySensor = humiditySensor;
    }

    public void setPressureSensor(Sensor pressureSensor) {
        this.pressureSensor = pressureSensor;
    }

    public Sensor getTemperatureSensor() {
        return temperatureSensor;
    }

    public Sensor getHumiditySensor() {
        return humiditySensor;
    }

    public Sensor getPressureSensor() {
        return pressureSensor;
    }
}
