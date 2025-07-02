
package com.mycompany.inventariostorepi.empleado;

import com.mycompany.inventariostorepi.usuario.Usuario;


public class Empleados implements IEmpleados {
    
    private Empleado[] empleado;
    private int totalEmpleado;
    private Empleado empleadoActivo; // nuevo campo

    public Empleados(int dimension) {
        empleado = new Empleado[dimension];
        totalEmpleado = 0;
    }

    public boolean iniciarSesion(String email, String contraseña) {
        for (int i = 0; i < totalEmpleado; i++) {
            Empleado emp = empleado[i];
            if (emp != null && 
                emp.getEmail().equals(email) && 
                emp.getContraseña().equals(contraseña)) {
                emp.setSesionActiva(true);
                empleadoActivo = emp;
                System.out.println("Sesion iniciada por: " + emp.getNombre());
                return true;
                
            }
        }
        return false;
    }

    public boolean cerrarSesion() {
        if (empleadoActivo != null && empleadoActivo.isSesionActiva()) {
            empleadoActivo.setSesionActiva(false);
            System.out.println("Sesion cerrada para: " + empleadoActivo.getNombre());
            empleadoActivo = null;
            return true;
        }
        System.out.println("No hay sesion activa.");
        return false;
    }

    
}

