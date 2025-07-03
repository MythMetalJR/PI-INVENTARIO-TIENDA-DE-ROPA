/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventariostorepi.controlador;

import com.mycompany.inventariostorepi.inventario.IInventarios;
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
    
    public void procesoControladorInventario(){
        try {
            String nombreInventario=vistaInventario.getNombre();
            String nombreTalla=vistaInventario.getTalla();
            String nombreCantidad=vistaInventario.getCantidad();
            String nombreMarca=vistaInventario.getMarca();
            String nombreCodigo=vistaInventario.getCodigoProducto();
            String nombrePrecio=vistaInventario.getPrecio();
            String nombreColor=vistaInventario.getColor();
            System.out.println("Acccion exitosa");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
