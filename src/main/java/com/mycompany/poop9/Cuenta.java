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
public class Cuenta {
    private double saldo;
    private int num=0;
    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double monto)throws LimiteDepositoException{
        System.out.println("Depositando "+monto); 
        if(monto>20000)
            throw new LimiteDepositoException();
        saldo+=monto;
    }
    public void retirar(double monto)throws SaldoInsuficienteException,LímiteRetirosException{
        if(num>=3)
            throw new LímiteRetirosException();
        System.out.println("Retirando "+monto);
        if(saldo<monto)
            throw new SaldoInsuficienteException();
        saldo-=monto;
        num++;
        //System.out.println(num);

    }
    public void consultaSaldo(){
        System.out.println("El saldo es: "+saldo);
    }
}
