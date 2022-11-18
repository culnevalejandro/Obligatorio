/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author culne
 */
public class Funcionario implements Serializable{
    private String nombre;
    private int numero;
    private int edad;

    public Funcionario(String unNombre, int unNumero, int unaEdad) {
        this.nombre = unNombre;
        this.numero = unNumero;
        this.edad = unaEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int unNumero) {
        this.numero = unNumero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int unEdad) {
        this.edad = unEdad;
    }
    
    
}
