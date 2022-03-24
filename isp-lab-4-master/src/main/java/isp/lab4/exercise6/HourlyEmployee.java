/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise6;

/**
 *
 * @author Sergiu
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    @Override
    public double getPaymentAmount(){
        return wage*hours;
    }

    public HourlyEmployee(double wage, double hours, String firstName, String lastName) {
        super(firstName, lastName);
        this.wage = wage;
        this.hours = hours;
    }
    
}
