/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 *
 * @author SERGIO
 */
public class Coche {
    String marca;
    String modelo;
    String color;
    int combustible;
    int año;
    
    public Coche(){
    }
    
    public Coche(String marca, String modelo, String color, int combustible, int año){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.combustible=combustible;
        this.año=año;
    
    }
    public void imprimeCoche(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(color);
        System.out.println(combustible);
        System.out.println(año);
    }
    
    public void arrancar(){
        System.out.println("arrancando");
    }
    public void acelerar(){
        double a = Math.random() * 100;
         System.out.printf("El coche aceleró", a, "km/h");
    
    }
    public void frenar(){
        System.out.println("Frenando");
    
    }
    
    public void apagar(){
        System.out.println("Apagando...");
    } 
    
    public void girar(){
        double d = Math.random() * 1;
        if (d==1)
            System.out.println("girando a la redecha");
        else 
            System.out.println("girando a la izquierda");
    }
    
}
