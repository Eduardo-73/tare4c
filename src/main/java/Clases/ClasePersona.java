/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eduardo
 */
public class ClasePersona {

    private String nombre;
    private int edad;
    private char sexo;
    final private String NIF;
    private double peso;//Kg
    private double altura;//cm

    public ClasePersona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = asignarSexo(sexo);
        this.NIF = generarNIF();
        this.peso = calcularIMC();
        this.altura = altura;
    }

    public void darLike(Serie serie){
           serie.darLike();
    }
    private boolean filtrarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M' || sexo == 'O');
    }

    private char asignarSexo(char sexo) {
        char sex = filtrarSexo(sexo) ? sexo : 'O';
        return sex;
    }

    private String generarNIF() {
        String numeronif;
        
        String[] letraNIF = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        numeronif = RandomStringUtils.randomNumeric(8);
        
        return numeronif;
    }

    public boolean esMayorEdad(){
        return this.edad>=18;
    }
    
    public float calcularIMC(){
        return (float)(this.peso/Math.pow(this.altura, 2)); 
    } 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

     @Override
    public String toString() {
        return "ClasePersona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", NIF=" + NIF + ", peso=" + peso + ", altura=" + altura + '}';
    }
}
