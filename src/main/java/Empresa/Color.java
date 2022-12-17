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
public enum Color {
    ROJO, NEGRO, AMARILLO, VERDE, AZUL, BLANCO;
    
    public static Color getAleatorio(){
        
        var generador = new Random();
        
        Color[] colores = Color.values();
        int posicion = generador.nextInt(0,colores.length);
        
        return colores[posicion];
    }
}
