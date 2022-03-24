/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab3;
import org.junit.Test;
import isp.lab3.exercise1.Tree;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Sergiu
 */
public class TreeTest {
    
    
    @Test
    public void testgrow(){
        Tree newtree= new Tree();
        Tree newtree1= new Tree();
        newtree.grow(2);
        newtree1.grow(1/2);
        assertEquals("The height should be 17", 17, newtree.getHeight());
        assertEquals("The height should be 15", 15, newtree1.getHeight());
    }
    
    @Test
    public void testtoString(){
        Tree lasttree= new Tree();
         assertEquals("Tree has: 15 meters", lasttree.toString());
    }
    
}
