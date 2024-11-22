/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop7;

/**
 *
 * @author SERGIO
 */
public class Gerente extends Empleado{
    private float presupuesto;
   
    public Gerente(){
    }

    public Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
   
/*
    public Gerente(float presupuesto) {
        this.presupuesto = presupuesto;
    }
*/
    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
   
    public float asignarPresupuesto(float presupuesto){
        this.presupuesto=presupuesto;
        return presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
       
    }
}