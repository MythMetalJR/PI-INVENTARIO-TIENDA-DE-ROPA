/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventariostorepi;

import com.mycompany.inventariostorepi.empleado.Empleado;
import com.mycompany.inventariostorepi.empleado.Empleados;
import com.mycompany.inventariostorepi.empleado.IEmpleados;

/**
 *
 * @author Usuario
 */
public class InventarioStorePI {

    public static void main(String[] args) {
        
        IEmpleados objEmpleado = new Empleados(2);
        Empleado empleadoUno = new Empleado( 3, "Alexis", "alexisyasacama@gmail.com","23456", "Cajero", true);
        Empleado empleadoDos = new Empleado(4, "Ander", "anderayovi@gmail.com", "23456", "Gerente", true);
        
    objEmpleado.iniciarSesion("alexisyasacama@gmail.com", "23456");
    objEmpleado.cerrarSesion();
    }
}
