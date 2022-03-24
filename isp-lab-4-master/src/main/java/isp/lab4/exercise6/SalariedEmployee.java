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
public class SalariedEmployee extends Employee{
    private double weeklySalary;
    @Override
    public double getPaymentAmount(){
        return weeklySalary;
    }

    public SalariedEmployee(double weeklySalary, String firstName, String lastName) {
        super(firstName, lastName);
        this.weeklySalary = weeklySalary;
    }
    
}