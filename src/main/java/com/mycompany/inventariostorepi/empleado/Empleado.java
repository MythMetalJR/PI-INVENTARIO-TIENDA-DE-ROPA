
package com.mycompany.inventariostorepi.empleado;

import com.mycompany.inventariostorepi.usuario.Usuario;


public class Empleado extends Usuario {
    
    private int idEmpleado;

    public Empleado(int idEmpleado, String nombre, String email, String contraseña, String rol, boolean SesionActiva) {
        super(nombre, email, contraseña, rol, SesionActiva);
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + '}';
    }

    
    
    
    
}
