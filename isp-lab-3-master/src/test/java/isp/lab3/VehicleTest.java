/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab3;

import isp.lab3.exercise3.Vehicle;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sergiu
 */
public class VehicleTest {
    @Test
    public void testtoString() {
        Vehicle car3= new Vehicle("Ferrari","430",300,'B');
        assertEquals("Ferrari (430) speed 300 fuel type B",car3.toString());
    }
}
