/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop5;

/**
 *
 * @author SERGIO
 */
public class POOP5 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("###### Circulo #####");
        Circulo circulo = new Circulo();
        
        circulo.getRadio();
        
        System.out.println(circulo.getRadio());
        
        circulo.setRadio(7.77f);
        
        circulo.calcularArea();
        circulo.calcularPerimetro();
        
        
        
        System.out.println(" ####### Persona #####");
        Fecha fechaDeNacimiento = new Fecha(16, 10, 2003);
        fechaDeNacimiento.imprimirFecha();
           
        Persona Pablo = new Persona();
        Pablo.setEdad(20);
        Pablo.setAltura(1.70f);
        Pablo.setNombre("Sergio Ramirez");
        Pablo.setOcupacion("Estudiante");
        Pablo.setfechaDeNacimiento(fechaDeNacimiento);
           
        System.out.println(Pablo);
        
        System.out.println(" ####### Coche #####");
         // Crear una instancia de Carro
        Coche coche = new Coche("Sergio", "Manuel", "Alex", "Jaime");
        
        // Mostrar las posiciones de cada persona
        coche.posiciones();
        
        
    }

}
