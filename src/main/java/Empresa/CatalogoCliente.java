/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevaEjercicioTema5;

import java.util.Arrays;

/**
 *
 * @author eduardo
 */
public class CatalogoCliente {

    private int numeroClientes;
    private Cliente[] listaClientes;

    public CatalogoCliente(int numClientes) {
        numClientes = Math.abs(numClientes);
        this.numeroClientes = numClientes;
        this.listaClientes = new Cliente[numClientes];
        for (int i = 0; i < listaClientes.length; i++) {
            this.listaClientes[i] = new Cliente();
        }
    }

    public String toString() {
        String tmp = "";

        for (Cliente c : listaClientes) {

            if (c != null) {
                tmp += c.toString() + "\n";
            }
        }

        return tmp;
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }

    public Cliente buscarCliente(String nif) {
        Cliente aux = new Cliente();
        aux.setNif(nif);
        int posicion = buscarCliente(aux);
        return (posicion >= 0) ? this.listaClientes[posicion] : null;
    }

    public void borrarCliente(Cliente c) {
        int pos = buscarCliente(c);
        if (pos >= 0) {
            this.listaClientes[pos] = null;
        }
    }

    private int buscarCliente(Cliente c) {
        //Búsqueda secuencial
        if (c != null) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] != null && c.equals(this.listaClientes[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void anadirCliente(Cliente c) {
        //Si hay hueco, se inserta en el hueco

        if (this.numeroClientes < this.listaClientes.length) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] == null) {
                    this.listaClientes[i] = c;
                    this.numeroClientes++;
                    System.out.println("Guardando cliente en posicion " + i);
                    break;
                }
            }
        } else {
            this.numeroClientes++;
            this.listaClientes = Arrays.copyOf(listaClientes,
                    this.numeroClientes);
            this.listaClientes[this.numeroClientes - 1] = c;
        }
    }
}
