/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevaEjercicioTema5;

/**
 *
 * @author eduardo
 */
public class Motor {

    private int cc;
    private boolean estado;

    public Motor(int cc, boolean estado) {
        this.cc = cc;
        this.estado = estado;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void arrancar() {
        this.estado = true;
    }

    public void apagar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Motor{" + "cc=" + cc + ", estado=" + estado + '}';
    }

}
