/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author eduardo
 */
public class Test {

    public static void main(String[] args) {
        Rueda di = new Rueda(225, "MICHELIN");
        Rueda dd = new Rueda(225, "MICHELIN");
        Rueda ti = new Rueda(225, "MICHELIN");
        Rueda td = new Rueda(225, "MICHELIN");
        Ventana ventanaPiloto = new Ventana(false);
        Ventana ventanaCopiloto = new Ventana(false);
        Puerta piloto = new Puerta(ventanaPiloto, true);
        Puerta copiloto = new Puerta(ventanaCopiloto, false);
        Motor motor = new Motor(95, true);
        
        Coche coche1 = new Coche(dd, di, ti, td, motor, piloto, copiloto, "1564EAC");
        
        System.out.println(coche1);
          coche1.getPuertaPiloto().getVentana().abrir();
    }
}
