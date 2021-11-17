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
public class LimiteDepositoException extends Exception{

    public LimiteDepositoException() {
        super("No puede ingresar más de 20 mil pesos");
    }
    
}
