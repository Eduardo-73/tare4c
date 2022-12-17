/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.util.Arrays;

/**
 *
 * @author eduardo
 */
public class CatalogosVehiculos {

    private int numeroVehiculos;
    private Vehiculos[] listaVehiculos;

    //El constructor recibe el tamaño del catálogo e 
    //Inicializa la estructura de datos con vehiculos aleatorios.
    public CatalogosVehiculos(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.numeroVehiculos = tamanio;
        this.listaVehiculos = new Vehiculos[tamanio];
        for (int i = 0; i < listaVehiculos.length; i++) {
            this.listaVehiculos[i] = new Vehiculos();
        }
    }

//    public void mostrarCatalogo() {
//        for (Vehiculos v : listaVehiculos) {
//            System.out.println(v);
//        }
//    }
    public String toString() {
        String tmp = "";

        for (Vehiculos v : listaVehiculos) {

            if (v != null) {
                tmp += v.toString() + "\n";
            }
        }

        return tmp;
    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    //Número de vehículos que hay en el catálogo, no el tamaño
//    public Vehiculos[] getListaVehiculos() {
//        return listaVehiculos;
//    }
    public void borrarVehiculo(Vehiculos v) {
        int pos = buscarVehiculo(v);
        if (pos >= 0) {
            this.listaVehiculos[pos] = null;
        }
    }

    public Vehiculos buscarVehiculos(String bastidor) {
        Vehiculos aux = new Vehiculos();
        aux.setBastidor(bastidor);
        int posicion = buscarVehiculo(aux);
        return (posicion >= 0) ? this.listaVehiculos[posicion] : null;
    }

    private int buscarVehiculo(Vehiculos v) {
        //Búsqueda secuencial
        if (v != null) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                if (v.equals(this.listaVehiculos[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void anadirVehiculo(Vehiculos v) {
        //Si hay hueco, se inserta en el hueco

        if (this.numeroVehiculos < this.listaVehiculos.length) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                if (this.listaVehiculos[i] == null) {
                    this.listaVehiculos[i] = v;
                    this.numeroVehiculos++;
                    System.out.println("Guardando vehículo en posicion " + i);
                    break;
                }
            }
        } else {//El Arrays está lleno
//            Vehiculos [] nuevo = Arrays.copyOf(listaVehiculos, 
//                    ++this.numeroVehiculos);
            this.numeroVehiculos++;
            this.listaVehiculos = Arrays.copyOf(listaVehiculos,
                    /*++ (para que solo guarde un espacio en null)
                    y * para que multipilique y cree 20 espacios en null
                     */ this.numeroVehiculos);
            this.listaVehiculos[this.numeroVehiculos - 1] = v;
        }
    }
}
