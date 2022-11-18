/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.*;

/**
 Milagros Foti 256278
 Alejandro Culñev 276792
 */
public class Sistema implements Serializable {

    private ArrayList<Articulo> listaArticulos;
    private ArrayList<Funcionario> listaFuncionarios;
    private ArrayList<Drone> listaDrones;
    private ArrayList<Carga> listaCargas;
    private Carga[][][] matrizCarga;
    private ArrayList<Drone> listaDronesConVuelo;
    private ArrayList<Drone> listaDronesSinVuelo;
    private transient PropertyChangeSupport manejador;

    public ArrayList<Drone> getListaDronesConVuelo() {
        return listaDronesConVuelo;
    }

    public ArrayList<Drone> getListaDronesSinVuelo() {
        return listaDronesSinVuelo;
    }

    public void inicializarManejador() {
        this.manejador = new PropertyChangeSupport(this);
    }

    public Sistema() {
        this.manejador = new PropertyChangeSupport(this);
        this.matrizCarga = new Carga[12][10][6];
        this.listaArticulos = new ArrayList<>();
        this.listaFuncionarios = new ArrayList<>();
        this.listaDrones = new ArrayList<>();
        this.listaCargas = new ArrayList<>();
        this.listaDronesConVuelo = new ArrayList<>();
        this.listaDronesSinVuelo = new ArrayList<>();
    }

    public ArrayList<Carga> getListaCargas() {
        return listaCargas;
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public Carga getCargaEn(int fila, int columna, int area) {
        return matrizCarga[fila][columna][area];
    }

    public Carga[] getCargaEnFila(int fila, int area) {
        Carga[] aux = new Carga[10];
        for (int j = 0; j < 10; j++) {
            aux[j] = matrizCarga[fila][j][area];
        }
        return aux;
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public ArrayList<Drone> getListaDrones() {
        return listaDrones;
    }

    public void actualizarListaDrones() {
        //se agrega en lista de los vuelos
        this.listaDronesSinVuelo.clear();
        this.listaDronesConVuelo.clear();

        for (Drone dron : listaDrones) {
            if (dron.isTieneVuelo()) {
                listaDronesConVuelo.add(dron);
            } else {
                listaDronesSinVuelo.add(dron);
            }
        }
        manejador.firePropertyChange("listaDronesSinVuelo", 0, 1);
        manejador.firePropertyChange("listaDronesConVuelo", 0, 1);
    }

    public Drone getDroneSegunId(String unId) {
        Drone retorno = null;
        for (Drone drone : this.listaDrones) {
            if (drone.getId().equals(unId)) {
                retorno = drone;
            }
        }
        return retorno;
    }

    public void agregarCarga(Carga unaCarga, int unaFila, int unaColumna, int unArea) {
        this.matrizCarga[unaFila][unaColumna][unArea] = unaCarga;
        listaCargas.add(unaCarga);
    }

    public void eliminarCarga(Carga unaCarga, int unaFila, int unaColumna, int unArea) {
        this.listaCargas.remove(unaCarga);
        matrizCarga[unaFila][unaColumna][unArea]=null;
        
    }

    public Carga getCarga(int unaFila, int unaColumna, int unArea) {
        return this.matrizCarga[unaFila][unaColumna][unArea];
    }

    public void agregarArticulo(Articulo unArticulo) {
        listaArticulos.add(unArticulo);
        manejador.firePropertyChange("listaArticulos", 0, 1);
    }

    public Articulo getArticulo(int unNumero) {
        return listaArticulos.get(unNumero);
    }

    public void agregarFuncionario(Funcionario unFuncionario) {
        listaFuncionarios.add(unFuncionario);
        manejador.firePropertyChange("listaFuncionarios", 0, 1);
    }

    public Funcionario getFuncionario(int unNumero) {
        return listaFuncionarios.get(unNumero);
    }

    public void agregarDrone(Drone unDrone) {
        listaDrones.add(unDrone);
        manejador.firePropertyChange("listaDrones", 0, 1);
    }

    public boolean codigoRepetido(int unCodigo) {
        boolean repetido = false;
        for (Carga unaCarga : listaCargas) {
            if (unaCarga != null) {
                if (unaCarga.getCodigo() == unCodigo) {
                    repetido = true;
                }
            }
        }
        return repetido;
    }

    public boolean nombreRepetido(String unNombre) {
        boolean repetido = false;
        for (Articulo articulo : listaArticulos) {
            if (articulo.getNombre().equals(unNombre)) {
                repetido = true;
            }
        }
        return repetido;
    }

    public boolean idRepetido(String unId) {
        boolean repetido = false;
        for (Drone drone : listaDrones) {
            if (drone.getId().equals(unId)) {
                repetido = true;
            }
        }
        return repetido;
    }

    public boolean nroRepetido(int unNro) {
        boolean repetido = false;
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getNumero() == unNro) {
                repetido = true;
            }
        }
        return repetido;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.manejador.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.manejador.removePropertyChangeListener(listener);
    }

    public void agregarVuelo(Vuelo vuelo, String id) {

        this.getDroneSegunId(id).agregarVuelo(vuelo);
        this.manejador.firePropertyChange("lista vuelos", 0, 1);
    }
}
