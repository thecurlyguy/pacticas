/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop4;

/**
 *
 * @author SERGIO
 */
public class POOP4 {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.imprimeCoche();
        Coche coche2 = new Coche("Toyota", "Supra MK4", "Naranja", 100, 1994);
        coche2.imprimeCoche();
        
        coche2.arrancar();
        coche2.acelerar();
        coche2.frenar();
        coche2.apagar();
        coche2.girar();
       
        Perro perro = new Perro();
        perro.imprimePerro();
        Perro perro2 = new Perro("cafe", "chino", 20, "chihuahua", 5 );
        perro2.imprimePerro();
       
        perro2.jugar();
        perro2.saltar(3.5f, 7, 9);//los flotantes se pasan con una f
    }
}