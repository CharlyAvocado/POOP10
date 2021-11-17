/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop9;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Hyperion
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("############Arreglos######");
        try{
            String mensajes[]={"Mensaje uno","Mensaje dos","Mensaje tres"};
            for (int i = 0; i < 3; i++) {
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de rango en el arreglo");
            System.out.println(e);
        }
        
        System.out.println("#############Aritmetica##############");
        
        try{
            float equis=5/0;
            System.out.println(equis);            
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
            System.out.println(e);
        }catch(NullPointerException e){
            System.out.println("Error:"+e.getMessage());
        }catch(Exception e){
            System.out.println("Error general: "+e.getMessage());
        }
        System.out.println("Propagación############");        
        try{
            int division =division(10,5);
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Ocurrió un error: "+e.getMessage());
        }
        int division2 =division2(10,5);
        System.out.println(division2);
        
        System.out.println("throw-trhows############");
        try{
            int div3= division3(6,10);
            System.out.println(div3);
        }catch(ArithmeticException e){
            System.out.println("Ocurrió un error: "+e.getMessage());
        }
        
        System.out.println("###########crea nuevas excepciones###########");
        Cuenta miCuenta= new Cuenta();
        System.out.println("------Excepción de depósito----------");
        try{
            miCuenta.consultaSaldo();
            miCuenta.depositar(20000);
            miCuenta.consultaSaldo();
            miCuenta.depositar(21000);
        }catch(LimiteDepositoException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("------Excepción de retiros----------");
        try{
            miCuenta.consultaSaldo();
            miCuenta.retirar(1000);
            miCuenta.consultaSaldo();
            miCuenta.retirar(1500);
            miCuenta.consultaSaldo();
            miCuenta.retirar(4100);
            miCuenta.consultaSaldo();
            miCuenta.retirar(6000);
        
        } catch (SaldoInsuficienteException | LímiteRetirosException e) {
            System.out.println("Error: "+e.getMessage());        
        }
                      
    }

    private static int division(int a, int b) {
        int c=a/b;
        return c;
    }

    private static int division2(int a, int b) {
        int c=0;
        try{      
            c=a/b;
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        return c;

    }

    private static int division3(int a,int b)throws ArithmeticException{
        if (b==0){
            throw new NullPointerException();
        }
        int c=a/b;
        return c;
            
        }
    }

