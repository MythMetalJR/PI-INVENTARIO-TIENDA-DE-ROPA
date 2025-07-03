/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariostorepi.controlador;

import com.mycompany.inventariostorepi.inventario.IInventarios;
import com.mycompany.inventariostorepi.inventario.Inventario;
import com.mycompany.inventariostorepi.inventario.Inventarios;
import com.mycompany.inventariostorepi.vista.VInventario;

/**
 *
 * @author User
 */
public class ControladorInventario {

    private VInventario vistaInventario;
    private IInventarios iInventario;

    public ControladorInventario(VInventario vistaInventario) {
        this.vistaInventario = vistaInventario;
        this.iInventario = new Inventarios();
    }

    public ControladorInventario(IInventarios iInventario) {
        this.iInventario = iInventario;
    }

    public void agregarP() {
        //IInventarios objInventario = new Inventarios(10);
        //Inventario nombre = new Inventario (" ", 0, 0, " ", 0, 0, " "); 
        //objInventario.agregarProducto(nombre);
        System.out.println("Nombre: " + vistaInventario.getNombre());
        System.out.println("Talla: " + vistaInventario.getTalla());
        System.out.println("Cantidad: " + vistaInventario.getCantidad());
        System.out.println("Marca: " + vistaInventario.getMarca());
        System.out.println("Codigo:" + vistaInventario.getCodigoProducto());
        System.out.println("Precio: " + vistaInventario.getPrecio());
        System.out.println("Color: " + vistaInventario.getColor());
        System.out.println(" ");
    }

    public void buscarProducto() {
        try {
            int code = Integer.valueOf( vistaInventario.getCodigoProducto());
            int buscar = Integer.valueOf(vistaInventario.getBuscar());
            if (code == buscar) {
                System.out.println("El producto buscado es: " + vistaInventario.getNombre());
            } else {
                System.out.println("Codigo == Buscar (no es base de datos)");
            }
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
    

    public void procesoControladorInventario() {
        try {
            String nombreInventario = vistaInventario.getNombre();
            String nombreTalla = vistaInventario.getTalla();
            String nombreCantidad = vistaInventario.getCantidad();
            String nombreMarca = vistaInventario.getMarca();
            String nombreCodigo = vistaInventario.getCodigoProducto();
            String nombrePrecio = vistaInventario.getPrecio();
            String nombreColor = vistaInventario.getColor();
            System.out.println("Acccion exitosa");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
