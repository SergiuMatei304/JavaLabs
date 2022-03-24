/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab7.safehome;

/**
 *
 * @author Sergiu
 */
public class TenantNotFoundException extends Exception{

    public TenantNotFoundException(String message) {
        super(message);
    }
}
