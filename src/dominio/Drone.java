/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.*;

/**
 Milagros Foti 256278
 Alejandro Culñev 276792
 */
public class Drone implements Serializable{
    private String id;
    private String modelo;
    private int tipoCamara;
    private boolean tieneVuelo;
    private ArrayList<Vuelo> vuelos;

    public Drone(String unId, String unModelo, int unTipoCamara) {
        this.id = unId;
        this.modelo = unModelo;
        this.tipoCamara = unTipoCamara;
        this.tieneVuelo=false;
        this.vuelos=new ArrayList<> ();
    }

    public String getId() {
        return id;
    }

    public void setId(String unId) {
        this.id = unId;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String unModelo) {
        this.modelo = unModelo;
    }

    public int getTipoCamara() {
        return tipoCamara;
    }

    public void setTipoCamara(int unTipoCamara) {
        this.tipoCamara = unTipoCamara;
    }

    public boolean isTieneVuelo() {
        return tieneVuelo;
    }

    public void setTieneVuelo(boolean tieneVuelo) {
        this.tieneVuelo = tieneVuelo;
    }
    
    public void agregarVuelo(Vuelo unVuelo){
        this.vuelos.add(unVuelo);
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

}
