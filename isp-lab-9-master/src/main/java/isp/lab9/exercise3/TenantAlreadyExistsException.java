/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab9.exercise3;

/**
 *
 * @author Sergiu
 */
public class TenantAlreadyExistsException extends Exception{

    public TenantAlreadyExistsException(String message) {
        super(message);
    }
}
