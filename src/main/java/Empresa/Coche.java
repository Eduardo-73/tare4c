/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author eduardo
 */
public class Coche {

    private Rueda delanteraDerecha;
    private Rueda delanteraizquierda;
    private Rueda traseraIzquierda;
    private Rueda traseraDerecha;
    private Motor motor;
    private Puerta puertaPiloto;
    private Puerta puertaCopiloto;
    private String matricula;

    public Coche(Rueda delanteraDerecha, Rueda delanteraizquierda, Rueda traseraIzquierda, Rueda traseraDerecha, Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, String matricula) {
        this.delanteraDerecha = delanteraDerecha;
        this.delanteraizquierda = delanteraizquierda;
        this.traseraIzquierda = traseraIzquierda;
        this.traseraDerecha = traseraDerecha;
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.matricula = matricula;
    }

    public Rueda getDelanteraDerecha() {
        return delanteraDerecha;
    }

    public void setDelanteraDerecha(Rueda delanteraDerecha) {
        this.delanteraDerecha = delanteraDerecha;
    }

    public Rueda getDelanteraizquierda() {
        return delanteraizquierda;
    }

    public void setDelanteraizquierda(Rueda delanteraizquierda) {
        this.delanteraizquierda = delanteraizquierda;
    }

    public Rueda getTraseraIzquierda() {
        return traseraIzquierda;
    }

    public void setTraseraIzquierda(Rueda traseraIzquierda) {
        this.traseraIzquierda = traseraIzquierda;
    }

    public Rueda getTraseraDerecha() {
        return traseraDerecha;
    }

    public void setTraseraDerecha(Rueda traseraDerecha) {
        this.traseraDerecha = traseraDerecha;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" + "delanteraDerecha=" + delanteraDerecha + ", delanteraizquierda=" + delanteraizquierda + ", traseraIzquierda=" + traseraIzquierda + ", traseraDerecha=" + traseraDerecha + ", motor=" + motor + ", puertaPiloto=" + puertaPiloto + ", puertaCopiloto=" + puertaCopiloto + ", matricula=" + matricula + '}';
    }
    
    
}
