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
public class InvalidPinException extends Exception{

    public InvalidPinException(String message) {
        super(message);
    }
}
