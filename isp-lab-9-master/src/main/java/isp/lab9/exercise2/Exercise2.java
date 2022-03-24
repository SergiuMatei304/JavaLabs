package isp.lab9.exercise2;


public class Exercise2 {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor(SENSOR_TYPE.HUMIDITY);
        Sensor sensor2 = new Sensor(SENSOR_TYPE.PRESSURE);
        Sensor sensor3 = new Sensor(SENSOR_TYPE.TEMPERATURE);
        Controller controller = new Controller();

        sensor1.register(controller);
        sensor2.register(controller);
        sensor3.register(controller);

        sensor1.readSensor();
        sensor2.readSensor();
        sensor3.readSensor();
        sensor2.readSensor();
        sensor3.readSensor();
        sensor1.readSensor();

    }
}
