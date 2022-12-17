/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Menu {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Empresa e = new Empresa("546751231", "CarGlass");
        Cliente c1 = new Cliente();
        Vehiculos v1 = new Vehiculos();
        String menu;
        do {
            menu = """
                      ---------------------
                      1º Registrar cliente
                      2º Registrar Vehiculo
                      3º Alquilar Vehiculo
                      4º Mostrar clientes
                      5º Mostrar Vehiculos
                      6º Mostrar Alquileres
                      ---------------------
                      Escriba salir para 'salir'
                      ---------------------
                      """;
            System.out.println(menu);
            menu = teclado.nextLine();
            switch (menu) {
                case "1":
                    registrarUsuario(e);
                    break;
                case "2":
                    registrarVehiculo(e);
                    break;
                case "3":
                    alquilarVehiculos(e);
                    break;
                case "4":
                    mostrarCliente(e);
                    break;
                case "5":
                    mostrarVehiculos(e);
                    break;
                case "6":
                    mostrarAlquiler(e);
                    break;
                default:
            }
        } while (!(menu.equalsIgnoreCase("salir")));

    }

    public static void registrarUsuario(Empresa e) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String apellido;
        System.out.println("Introduce tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Introduce tu apellido: ");
        apellido = teclado.nextLine();
        Cliente c = new Cliente(nombre, apellido);
        e.getCatalogoCliente().anadirCliente(c);
    }

    public static void registrarVehiculo(Empresa e) {
        Vehiculos v = new Vehiculos();
        e.getCatalogoVehiculo().anadirVehiculo(v);
    }

    public static void alquilarVehiculos(Empresa e) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame tu número de NIF ");
        String nif = teclado.nextLine();
        System.out.println("Dame el número de bastidor del vehiculo ");
        String bastidor = teclado.nextLine();
        System.out.println("Cuentos días quieres alquilar el coche: ");
        int dias = teclado.nextInt();
        Alquileres aux = new Alquileres(e.buscarCliente(nif), e.buscarVehiculo(bastidor), LocalDate.now(), dias);
        e.getCatalogoAlquiler().anadirAlquiler(aux);
    }

    public static void mostrarCliente(Empresa e) {
        System.out.println(e.getCatalogoCliente());
    }

    public static void mostrarVehiculos(Empresa e) {
        System.out.println(e.getCatalogoVehiculo());
    }

    public static void mostrarAlquiler(Empresa e) {
        System.out.println(e.getCatalogoAlquiler());
    }
}
