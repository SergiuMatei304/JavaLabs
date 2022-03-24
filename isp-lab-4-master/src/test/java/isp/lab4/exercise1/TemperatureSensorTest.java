package isp.lab4.exercise1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TemperatureSensorTest {
    @Test
    public void testtoString(){
       TemperatureSensor sensor1= new TemperatureSensor();
       TemperatureSensor sensor2= new TemperatureSensor(10,"Back");
       assertEquals("TemperatureSensor(0, null)",sensor1.toString());
       assertEquals("TemperatureSensor(10, Back)",sensor2.toString());
    }
}
