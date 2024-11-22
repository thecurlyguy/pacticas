/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop5;

/**
 *
 * @author SERGIO
 */
public class Circulo {
      // Atributos
    
    // final se usa para constantes
    // Si la variable esta en mayusculas, es una constante
    final float PI = 3.14f;
    private float radio;
    
    
    // Constructores
    
    // Investigar porque es necesrio usar un constructor vacio
    public Circulo(){
        
    }
    public Circulo(float radio){
        this.radio = radio;
    }
    
    
    // Metodos de iniializacion
    
    public float getRadio(){
        return radio;
    }
    
    public void setRadio(float radio){
        this.radio = radio;
    }
    
    
    // Otros metodos
    
    public void calcularPerimetro(){
        System.out.println("Perimetro: " + 2 * PI * radio);
    }
    
    public void calcularArea() {
        System.out.println("Area: " + PI * radio * radio);
    }

}
