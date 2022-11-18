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
public class Carga implements Serializable{
    private Funcionario funcionario;
    private Articulo articulo;
    private int cantidad;
    private int codigo;

    public Carga(Funcionario funcionario, Articulo articulo, int cantidad, int codigo) {
        this.funcionario = funcionario;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.codigo = codigo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario unFuncionario) {
        this.funcionario = unFuncionario;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo unArticulo) {
        this.articulo = unArticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int unaCantidad) {
        this.cantidad = unaCantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int unCodigo) {
        this.codigo = unCodigo;
    }
    
    
           
}
