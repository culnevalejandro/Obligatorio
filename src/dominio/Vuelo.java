/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;

/**
 Milagros Foti 256278
 Alejandro Culñev 276792
 */
public class Vuelo implements Serializable{
    private Drone Dron;
    private String area;
    private int fila;
    private int [] codigosDeCargas;
    private boolean exitoso;
    private int coincidencias;
    private int diferencias;
    private int cantLineasCodigo;
    private String nombreArchivo;

    public Vuelo(Drone unDron, String unArea, int unaFila, String unNombreArchivo, boolean exitoso) {
        this.Dron = unDron;
        this.area = unArea;
        this.fila = unaFila;
        this.nombreArchivo = unNombreArchivo;
        this.exitoso=exitoso;
    }

    public Drone getDron() {
        return Dron;
    }

    public void setDron(Drone Dron) {
        this.Dron = Dron;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int[] getCodigosDeCargas() {
        return codigosDeCargas;
    }

    public void setCodigosDeCargas(int[] codigosDeCargas) {
        this.codigosDeCargas = codigosDeCargas;
    }

    public boolean isExitoso() {
        return exitoso;
    }

    public void setExitoso(boolean exitoso) {
        this.exitoso = exitoso;
    }

    public int getCoincidencias() {
        return coincidencias;
    }

    public void setCoincidencias(int coincidencias) {
        this.coincidencias = coincidencias;
    }

    public int getDiferencias() {
        return diferencias;
    }

    public void setDiferencias(int diferencias) {
        this.diferencias = diferencias;
    }

    public int getCantLineasCodigo() {
        return cantLineasCodigo;
    }

    public void setCantLineasCodigo(int cantLineasCodigo) {
        this.cantLineasCodigo = cantLineasCodigo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
        public int getAreaNro(){
        int aux=0;
        switch (this.getArea()) {
            case "A" -> {
                aux = 0;
            }

            case "B" -> {
                aux = 1;
            }

            case "C" -> {
                aux = 2;
            }

            case "D" -> {
                aux = 3;
            }

            case "E" -> {
                aux = 4;
            }

            case "F" -> {
                aux = 5;
            }
        }
        return aux;
    }
    
    
    @Override
    public String toString(){   
        String aux = "Archivo: "+this.getNombreArchivo()+" | Área: "+this.getArea()+" | Fila: "+this.getFila()+1;
        
        if(this.isExitoso()){
            aux+=" | Coinciden: "+this.getCoincidencias()+" | Difieren: "+this.getDiferencias();
        }else{
            aux+=" | Cantidad de lineas de carga: "+this.getCantLineasCodigo();
        }
        
        return aux;
    }
    
}
