
package com.mycompany.inventariostorepi.inventario;

import com.mycompany.inventariostorepi.empleado.Empleado;

public class Inventario {
    
    private String Nombre;
    private int talla;
    private int cantidad;
    private String marca; 
    private int codigoProducto;
    private double precio; 
    private String color; 

    public Inventario(String Nombre, int talla, int cantidad, String marca, int codigoProducto, double precio, String color) {
        this.Nombre = Nombre;
        this.talla = talla;
        this.cantidad = cantidad;
        this.marca = marca;
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.color = color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Inventario{" + "Nombre=" + Nombre + ", talla=" + talla + ", cantidad=" + cantidad + ", marca=" + marca + ", codigoProducto=" + codigoProducto + ", precio=" + precio + ", color=" + color + '}';
    }
       
}
