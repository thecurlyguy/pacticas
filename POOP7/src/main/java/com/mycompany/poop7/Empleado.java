/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop7;

/**
 *
 * @author SERGIO
 */
public class Empleado extends Object{
    private String nombre;
    private int numEmpleado;
    private float sueldo;
   
    public Empleado(){}
   
    public Empleado(String nombre, int numEmpleado, float sueldo){
        this.nombre=nombre;
        this.numEmpleado=numEmpleado;
        this.sueldo=sueldo;
       
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void setNumEmpleado(int numEmpleado){
        this.numEmpleado = numEmpleado;
    }
   
    public float getSueldo(){
        return sueldo;
   
    }
   
    public void setSueldo(){
        this.sueldo = sueldo;
    }
   
    public void aumentarSueldo(int porcentajeDeAumento){
        sueldo +=(sueldo*porcentajeDeAumento)/100;
       
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
   
}