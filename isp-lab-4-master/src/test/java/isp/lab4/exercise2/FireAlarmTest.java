/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sergiu
 */
public class FireAlarmTest {
   @Test
    public void testtoString(){
        FireAlarm alarm= new FireAlarm(false);
        assertEquals("FireAlarm(false)",alarm.toString());
        alarm.setActive(true);
        assertEquals("This sould be true",true,alarm.isActive());
    } 
}
