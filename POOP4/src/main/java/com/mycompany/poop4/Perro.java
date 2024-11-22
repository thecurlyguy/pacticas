/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 *
 * @author SERGIO
 */
public class Perro {
    String color;
    String pelaje;
    int tamaño;
    String raza;
    int edad;
   
   
    public Perro(){
        color=null;
        pelaje = null;
        tamaño=0;
        raza=null;
        edad=0;
               
   
    }
    public Perro(String color, String pelaje, int tamaño, String raza, int edad){
        this.color=color;
        this.pelaje=pelaje;
        this.tamaño=tamaño;
        this.raza=raza;
        this.edad=edad;
       
   
    }
    public void imprimePerro(){
        System.out.println(color);
        System.out.println(pelaje);
        System.out.println(tamaño);
        System.out.println(raza);
        System.out.println(edad);
       
       
   
    }
    public void jugar(){
        System.out.println("Està jugando");
   
    }
    public boolean comer(){
        System.out.println("estoy comiendo");
        return true;
    }
    public void correr(){
        System.out.println("corro en el patio");
    }
    public void morder(){
        System.out.println("muerdo");
    }
    public void saltar(float saltar, float saltar2, float saltar3){
        System.out.printf("Me movì a %f, %f, %f", saltar, saltar2, saltar3);
   
    }
   
   
}

