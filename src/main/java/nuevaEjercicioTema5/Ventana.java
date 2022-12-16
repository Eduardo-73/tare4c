/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevaEjercicioTema5;

/**
 *
 * @author eduardo
 */
public class Ventana {
    
    private boolean estado;
    
    public Ventana (boolean estado){
        this.estado = estado;
    }
    
    //En vez de getter y setters se puede hacer estos métodos
    public void abrir() {
        this.estado = true;
    }

    public void cerrar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Ventana{" + "estado=" + estado + '}';
    }
    
    
}
