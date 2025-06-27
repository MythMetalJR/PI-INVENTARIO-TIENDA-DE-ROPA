
package com.mycompany.inventariostorepi.empleado;

import com.mycompany.inventariostorepi.usuario.Usuario;


public class Empleados implements IEmpleados {

    private Empleado[] empleado;
    private int totalEmpleado;

    public Empleados(int dimension) {
        empleado = new Empleado[dimension];
        totalEmpleado = 0;
    }

    
    public boolean IniciarSesion(String emailV, String contraseñaV) {
       //if (emailV == null || contraseñaV == null) return false;

        for (int i = 0; i < totalEmpleado; i++) {
            Usuario emp = empleado[i];
            if (emp.getEmail().equals(emailV) &&
                emp.getContraseña().equals(contraseñaV)) {
                emp.setSesionActiva(true);
                System.out.println("Bienvenido Usuario: "+ empleado[i].getNombre());
                return true;
            }
        }
        return false;
    }

    public boolean CerrarSecion() {
        for (int i = 0; i < totalEmpleado; i++) {
            Empleado emp = empleado[i];
            if (emp.isSesionActiva()) {
                emp.setSesionActiva(false);
                return true;
            }
        }
        return false;
    }
}

