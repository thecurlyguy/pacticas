/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop7;

import zoologico.Animal;

/**
 *
 * @author SERGIO
 */
public class POOP7 {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Sergio", 31926, 3500f);
       
        Empleado empleado2 = new Empleado("Mnuel", 6894, 260f);
       
        System.out.println(empleado);
       
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
       
        Gerente gerente1 = new Gerente(1000, "Checo", 3270, 300f);
        System.out.println(gerente1);
       
        Gerente gerente2 = new Gerente();
        System.out.println(gerente2);
        gerente2.setPresupuesto(100);
        gerente2.setNombre("Alan");
        System.out.println(gerente2);
        System.out.println(gerente2.getNombre());
       
        Animal animal = new Animal();
        System.out.println(animal);
       
    }
}
