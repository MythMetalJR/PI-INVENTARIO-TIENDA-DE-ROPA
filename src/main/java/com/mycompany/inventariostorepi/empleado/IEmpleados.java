
package com.mycompany.inventariostorepi.empleado;


public interface IEmpleados {
    
    public boolean iniciarSesion(String email, String contraseña);
    public boolean cerrarSesion();
}
