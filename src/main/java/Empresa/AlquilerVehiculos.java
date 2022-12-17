/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevaEjercicioTema5;

import java.time.LocalDate;

/**
 *
 * @author eduardo
 */
public class AlquilerVehiculos {

    public static void main(String[] args) {
        
        CatalogosVehiculos cv = new CatalogosVehiculos(5);
        CatalogoCliente cc = new CatalogoCliente(5);
        Cliente c = cc.buscarCliente("3");
        System.out.println(c);
        Vehiculos v = cv.buscarVehiculos("4");
        System.out.println(v);
        Alquileres a = new Alquileres(c, v, LocalDate.now(), 8);
        System.out.println(a);
        CatalogoAlquiler ca = new CatalogoAlquiler(10);
        ca.anadirAlquiler(a);
        System.out.println("Lista de alquileres ");
        System.out.println(ca);
    }

}
