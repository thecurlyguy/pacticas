/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author SERGIO
 */
public class POOP3 {

    public static void main(String[] args) {
        int nums[];
        int[] nums2={1, 2, 3, 4, 5};
        int[]nums3=new int[5];
        int[] nums4;
        nums4 = new int[5];
       
        System.out.println("#####for each#####");
        for(int temp : nums2){
            System.out.println("Cuenta: " + temp);
        }
       
        System.out.println("####for####");
        for(int i=0; i<nums4.length;i++){
            nums4[i]=i*10;
        }
       
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
           
        }
        System.out.println("#####String#####");
        String cadena = new String("Hola mundo");
        System.out.println(cadena);
       
       
        String cadena1 = "Hola mundo de forma recomendada";
        System.out.println(cadena1);
       
        String nombre = "Jorge";
        String apellido = "Rodriguez";
        System.out.println(nombre);
        System.out.println(apellido);
        String nombreCompleto = nombre+""+apellido;
        System.out.println(nombreCompleto);
       
        System.out.println("#### Wrapper#####");
        int a = 4;
        Integer b = new Integer(4);
        System.out.println(b);
        Integer c = 4;
        System.out.println(c);
        Integer d = a;
        String cadena3 = d.toString();
        String cadena4 = 4 + "";
        System.out.println(cadena3);
        System.out.println(cadena4);
       
        System.out.println("####Colecciones: almacenan referencias#####");
        System.out.println("####Array#####");
       
        ArrayList<Integer>miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(33);
        miArrayList.add(77);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(1, 10);
        System.out.println(miArrayList.size());
        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        miArrayList.add(77);
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        System.out.println("Nuevo tamaño"+miArrayList.size());
        System.out.println("##### Hashable #####");
        Hashtable<Integer, String> miTabla = new Hashtable<Integer, String>();
        miTabla.put(1, "uno");
        miTabla.put(558639, "Antonio");
        miTabla.put(44778899, "Diana");
        System.out.println("Elementos en tabla: "+miTabla.size());
       
        System.out.println("#####Enumerador####");
        Integer llave;
        String valor;
        
        Enumeration<Integer> enumeradorLlaves = miTabla.keys();
        while(enumeradorLlaves.hasMoreElements()){
            llave = enumeradorLlaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println(llave+""+valor);
        
        }
        System.out.println(Math.PI);
        Date dia = new Date();
        System.out.println(dia);
        //Calendar 
    }
}
