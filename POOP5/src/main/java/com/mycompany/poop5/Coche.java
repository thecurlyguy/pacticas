/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop5;

/**
 *
 * @author SERGIO
 */
public class Coche {
    private String chofer;
    private String copiloto;
    private String pasajero1;
    private String pasajero2;

    // Constructor
    public Coche(String chofer, String copiloto, String pasajero1, String pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

    // Método para indicar la posición de cada persona
    public void posiciones() {
        System.out.println(chofer + " está en la posición de chófer.");
        System.out.println(copiloto + " está en la posición de copiloto.");
        System.out.println(pasajero1 + " está en la posición de pasajero 1.");
        System.out.println(pasajero2 + " está en la posición de pasajero 2.");
    }

    
}
