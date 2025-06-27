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
        Empleado empleadoUno = new Empleado(3, "Alexis", "alexisyasacama@gmail.com", "Lalo15", "Cajero", true);
        Empleado empleadoDos = new Empleado(4, "Ander", "anderayovi@gmail.com", "util2015", "Gerente", true);
        
    objEmpleado.IniciarSesion("alexisyasacama@gmail.com", "Lalo15");
    objEmpleado.CerrarSecion();
    }
}
