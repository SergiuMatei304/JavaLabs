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
public class ComissionEmployee extends Employee{
    private double grossSales;
    private double comissionSales;
    @Override
    public double getPaymentAmount(){
        return comissionSales;
    }

    public ComissionEmployee(double grossSales, double comissionSales, String firstName, String lastName) {
        super(firstName, lastName);
        this.grossSales = grossSales;
        this.comissionSales = comissionSales;
    }
    
}
