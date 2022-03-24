/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab3;

import isp.lab3.exercise4.MyPoint;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sergiu
 */
public class MyPointTest {
    @Test
    public void testdistance(){
        MyPoint point= new MyPoint(1,4,5);
        assertEquals("The distance should be 5",5, (int)point.distance(1,1,1));
    }
}
