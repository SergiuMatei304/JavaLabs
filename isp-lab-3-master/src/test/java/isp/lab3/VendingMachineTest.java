/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab3;

import isp.lab3.exercise5.VendingMachine;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sergiu
 */
public class VendingMachineTest {
    VendingMachine machine= new VendingMachine();
    @Test
    public void testdisplayProducts(){
        assertEquals("1. Long Coffee \n2. Frappuccino \n3. Hot chocolate \n4. Cappuccino\n5. Tea \n6. Espresso \n7. Long Espresso \n8. Latte \n9. Grand Latte",machine.displayProducts());
    }
    @Test
    public void testinsertCoin(){
        machine.insertCoin(17);
        assertEquals("The coins should be 17", 17, machine.getCredit());
    }
    @Test
    public void testselectProduct(){
       assertEquals("Long Coffee",machine.selectProduct(1)); 
       assertEquals("Frappuccino",machine.selectProduct(2));
       assertEquals("Hot chocolate",machine.selectProduct(3));
       assertEquals("Cappuccino",machine.selectProduct(4));
       assertEquals("Tea",machine.selectProduct(5));
       assertEquals("Espresso",machine.selectProduct(6));
       assertEquals("Long Espresso",machine.selectProduct(7));
       assertEquals("Latte",machine.selectProduct(8));
       assertEquals("Grand Latte",machine.selectProduct(9));
       assertEquals("No item available at id: 17",machine.selectProduct(17));
    }
}
