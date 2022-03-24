/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sergiu
 */
public class ControlerTest {
   @Test
    public void testcontrolStep(){
      TemperatureSensor sensor1= new TemperatureSensor(30,"Front");
      FireAlarm alarm1= new FireAlarm(false);
      Controler controler1= new Controler(sensor1,alarm1);  
      TemperatureSensor sensor2= new TemperatureSensor(60,"Back");
      FireAlarm alarm2= new FireAlarm(false);
      Controler controler2= new Controler(sensor2,alarm2);  
      controler1.controlStep();
      assertEquals("This alarm should be turn off",false,alarm1.isActive());
      controler2.controlStep();
      assertEquals("This alarm should be turn on",true,alarm2.isActive());
    } 
}
