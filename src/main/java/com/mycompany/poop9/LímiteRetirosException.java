/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop9;

/**
 *
 * @author Hyperion
 */
public class LímiteRetirosException extends Exception {

    public LímiteRetirosException() {
        super("No puede realizar más de 3 retiros");
    }
    
}
