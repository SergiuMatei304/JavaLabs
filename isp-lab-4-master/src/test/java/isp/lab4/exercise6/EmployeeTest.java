/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise6;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Sergiu
 */
public class EmployeeTest {
    @Test
    public void testgetPaymentAmount(){
        Employee employee1= new Employee("Sergiu","Matei");
        ComissionEmployee employee2= new ComissionEmployee(10.2,22.5,"Ionutz","Sarbu");
        HourlyEmployee employee3= new HourlyEmployee(1100,77.5,"Catalin","Silaghi");
        SalariedEmployee employee4= new SalariedEmployee(800,"Ionel","Bolbel");
        assertEquals(0.0,employee1.getPaymentAmount(),0.001);
        assertEquals(22.5,employee2.getPaymentAmount(),0.001);
        assertEquals(85250.0,employee3.getPaymentAmount(),0.001);
        assertEquals(800.0,employee4.getPaymentAmount(),0.001);
    }
}
