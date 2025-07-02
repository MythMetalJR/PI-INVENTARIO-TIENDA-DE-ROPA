
package com.mycompany.inventariostorepi.inventario;

import com.mycompany.inventariostorepi.empleado.Empleado;

public class Inventario {
    private TipoProducto tipoProducto; 
    private String marca; 
    private int codigoProducto;
    private int talla; 
    private String modelo; 
    private String color; 
    private String tipoTela;
    private double precio; 
    private int cantidad; 

    public Inventario(TipoProducto tipoProducto, String marca, int codigoProducto, int talla, String modelo, String color, String tipoTela, double precio, int cantidad) {
        this.tipoProducto = tipoProducto;
        this.marca = marca;
        this.codigoProducto = codigoProducto;
        this.talla = talla;
        this.modelo = modelo;
        this.color = color;
        this.tipoTela = tipoTela;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
}
