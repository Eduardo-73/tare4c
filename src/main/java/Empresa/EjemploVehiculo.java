/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author eduardo
 */
public class EjemploVehiculo {

    public static void main(String[] args) {

//        Modelo aleatorio = Modelo.getAleatorio();
//        
//        System.out.println("El modelo aleatorio es " + aleatorio.getModelo());
//        
//        System.out.println("Color " + Color.getAleatorio());
//        Vehiculos v = new Vehiculos();
//        System.out.println(v);
        CatalogosVehiculos catalogo = new CatalogosVehiculos(10);

        System.out.println("Nº vehículo del catálogo: " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);

        System.out.println("--------- Después de borrar el de la posición 3 ----------");
        System.out.println("Nº vehículo del catálogo: " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);

        Vehiculos aux = new Vehiculos();
        aux.setBastidor("148456123");
        catalogo.anadirVehiculo(aux);

        System.out.println("--------- Después de borrar el de la posición 3 ----------");
        System.out.println("Nº vehículo del catálogo: " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);

        aux.setBastidor("99999999999");
        catalogo.anadirVehiculo(aux);
        System.out.println("--------- Después de borrar el de la posición 3 ----------");
        System.out.println("Nº vehículo del catálogo: " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
//        
//        catalogo.mostrarCatalogo();
//        
//        Vehiculos[] array = catalogo.getListaVehiculos();
//        array[0].setBastidor("123A");
//        
//        System.out.println("-----------------------------------");
//        catalogo.mostrarCatalogo();
//        
//        v.setBastidor("123A");
//        System.out.println(v);
//        int pos = catalogo.buscarVehiculo(v);
//        System.out.println("posición " + pos);
//        catalogo.mostrarCatalogo();
    }
}
