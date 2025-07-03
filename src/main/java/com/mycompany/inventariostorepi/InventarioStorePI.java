/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.inventariostorepi;

import com.mycompany.inventariostorepi.empleado.Empleado;
import com.mycompany.inventariostorepi.empleado.Empleados;
import com.mycompany.inventariostorepi.empleado.IEmpleados;
import com.mycompany.inventariostorepi.inventario.IInventarios;
import com.mycompany.inventariostorepi.inventario.Inventarios;
import com.mycompany.inventariostorepi.inventario.Inventario;
import com.mycompany.inventariostorepi.vista.VInventario;

/**
 *
 * @author Usuario
 */
public class InventarioStorePI {

    public static void main(String[] args) {
        
        VInventario vistaInventario = new VInventario();
        vistaInventario.setVisible(true);

        IEmpleados objEmpleado = new Empleados(2);
        Empleado empleadoUno = new Empleado(3, "Alexis", "alexisyasacama@gmail.com", "23456", "Cajero", true);
        Empleado empleadoDos = new Empleado(4, "Ander", "anderayovi@gmail.com", "23456", "Gerente", true);

        objEmpleado.iniciarSesion("alexisyasacama@gmail.com", "23456");
        objEmpleado.cerrarSesion();

        IInventarios objInventario = new Inventarios(10);
        Inventario productoUno = new Inventario("Zapatos", 43, 10, "Nike", 2734, 20, "azul");
        Inventario productoDos = new Inventario("Camisa", 34, 40, "Adidas", 3030, 34, "Negro");

        objInventario.agregarProducto(productoUno);
        objInventario.agregarProducto(productoDos);
        objInventario.imprimirProductos();

        Inventario editar = new Inventario("Nike", 20, 40, "Overside", 80, 5,"Rojo");
        System.out.println("--------PRODUCTO BUSCADO POR CODIGO--------");
        objInventario.buscarProductoCodigo(2020);
        System.out.println("--------PRODUCTO EDITADO--------");
        objInventario.editarProducto(0, editar);
        objInventario.imprimirProductos();
        System.out.println("--------PRODUCTO ELIMINADO--------");
        Inventario eliminar = new Inventario (" ", 0, 0, " ", 0, 0, " ");
        objInventario.eliminarProducto(1, eliminar);
        objInventario.imprimirProductos();
        
        objInventario.calcularInventarioTotal();
        
    }
}
