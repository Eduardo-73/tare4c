/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author eduar
 */
public class Prueba {

    public static void main(String[] args) {

        ClasePersona p1 = ServicioPersona.servicioPersona();

        ClasePersona p2 = new ClasePersona();

        System.out.println(p1);
        System.out.println(p2);
        
        String mayorEdad = p1.esMayorEdad()? "Es mayor de edad " : "Es menor de edad "; 
        System.out.println(p1.getNombre() + " " + mayorEdad);
       
        double imc = p1.calcularIMC();

        if (imc < 18){
            System.out.println("Su peso es inferior a lo normal ");
        }else if( imc >= 18 && imc < 25){
            System.out.println("Su peso es normal ");
        }else{
            System.out.println("Su peso es superior a lo normal ");
        }  
        System.out.println(p1.getNombre() + " Tiene un IMC de: " + imc);

    }
   
}
