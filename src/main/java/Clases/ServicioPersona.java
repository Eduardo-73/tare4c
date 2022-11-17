/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class ServicioPersona {

    public static ClasePersona servicioPersona() {

        Scanner teclado = new Scanner(System.in);

        String nombre, sexoString;
        int edad;
        char sexo;
        double peso, altura;

        System.out.println("Introduce tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("-----------------------");
        do {
            System.out.println("Introduce tu edad: ");
            try {
                edad = teclado.nextInt();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Introduzca un número valido, por favor ");
                teclado.nextLine();
            }
        } while (true);
        System.out.println("-----------------------");
        teclado.nextLine();
        System.out.println("Introduce tu sexo ");
        sexoString = teclado.nextLine();
        sexo = sexoString.charAt(0);
        System.out.println("-----------------------");
        do {
            System.out.println("Introduce tu peso ");
            try {
                peso = teclado.nextDouble();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Introduzca un número valido, por favor ");
                teclado.nextLine();
            }
        } while (true);
        System.out.println("-----------------------");
        do {
            System.out.println("Introduce tu altura ");
            try {
                altura = teclado.nextDouble();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Introduzca un número valido, por favor ");
                teclado.nextLine();
            }
        } while (true);

        ClasePersona p1 = new ClasePersona(nombre, edad, sexo, peso, altura);
        return p1;
    }

}
