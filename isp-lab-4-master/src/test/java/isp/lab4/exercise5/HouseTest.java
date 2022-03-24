/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sergiu
 */
public class HouseTest {
    @Test
    public void testcontrolStep(){
        Controler controler=new Controler();
        House house=new House(controler);
        house.getControler().controlStep();
        assertEquals("This alarm should be started",true,house.getControler().getFireAlarm().isActive());
        TemperatureSensor[] temperatureSensors1=new TemperatureSensor[3];
        temperatureSensors1[0]=new TemperatureSensor(30,"Front");
        temperatureSensors1[1]=new TemperatureSensor(40,"Back");
        temperatureSensors1[2]=new TemperatureSensor(20,"Middle");
        house.getControler().setTemperatureSensors(temperatureSensors1);
        house.getControler().controlStep();
        assertEquals("This alarm should not be started",false,house.getControler().getFireAlarm().isActive());
    }
}
