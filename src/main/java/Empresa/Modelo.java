/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Empresa;

import java.util.Random;

/**
 *
 * @author eduardo
 */
public enum Modelo {

    SEAT_PANDA("Seat", "Panda", "48"),
    FORD_KUGA("Ford", "Kuga", "120"),
    CUPRA("Seat", "Cupra", "76");

    String marca;
    String modelo;
    String cilindradas;

    private Modelo(String marca, String modelo, String cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    @Override
    public String toString() {
        return "Modelo{" + "marca=" + marca + ", modelo=" + modelo + ", cilindradas=" + cilindradas + '}';
    }

    public static Modelo getAleatorio(){
        
        Random generador = new Random();
        Modelo[] modelos = Modelo.values();
//        for (int i = 0; i < modelos.length; i++) {
//            System.out.println(modelos[i]);
//        }
        int posicionValidas = generador.nextInt(0,modelos.length);
        
        return modelos[posicionValidas];
    }
}
