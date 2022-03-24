/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sergiu
 */
public class ControlerTest {
    @Test
    public void testcontrolStep(){
       TemperatureSensor[] temperatureSensors1= new TemperatureSensor[3];
       temperatureSensors1[0]=new TemperatureSensor(60,"Front");
       temperatureSensors1[1]=new TemperatureSensor(60,"Back");
       temperatureSensors1[2]=new TemperatureSensor(60,"Middle");
       FireAlarm alarm1= new FireAlarm(false);
       Controler control1=new Controler(temperatureSensors1,alarm1);
       control1.controlStep();
       assertEquals("This alarm should be started",true,alarm1.isActive());
       TemperatureSensor[] temperatureSensors2= new TemperatureSensor[3];
       temperatureSensors2[0]=new TemperatureSensor(30,"Front");
       temperatureSensors2[1]=new TemperatureSensor(60,"Back");
       temperatureSensors2[2]=new TemperatureSensor(40,"Middle");
       FireAlarm alarm2= new FireAlarm(false);
       Controler control2=new Controler(temperatureSensors1,alarm1);
       control1.controlStep();
       assertEquals("This alarm should be not started",false,alarm2.isActive());
    }
}
