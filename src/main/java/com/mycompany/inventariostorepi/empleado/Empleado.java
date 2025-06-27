
package com.mycompany.inventariostorepi.empleado;

import com.mycompany.inventariostorepi.usuario.Usuario;


public class Empleado extends Usuario {
    
    private double idEmpleado;

    public Empleado(double idEmpleado, String nombre, String email, String contraseña, String rol, boolean SesionActiva) {
        super(nombre, email, contraseña, rol, SesionActiva);
        this.idEmpleado = idEmpleado;
    }

    public double getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(double idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + '}';
    }

    
    
    
    
}
