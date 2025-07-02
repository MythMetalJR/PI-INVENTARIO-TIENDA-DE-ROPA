
package com.mycompany.inventariostorepi.usuario;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private String email;
    private String contraseña;
    private String rol;
    private boolean sesionActiva;
    
    public Usuario(String nombre, String email, String contraseña, String rol, boolean SesionActiva) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;
        this.sesionActiva = SesionActiva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setSesionActiva(boolean SesionActiva) {
        this.sesionActiva = SesionActiva;
    }

    public boolean isSesionActiva() {
        return sesionActiva;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + ", contrase\u00f1a=" + contraseña + ", rol=" + rol + ", SesionActiva=" + sesionActiva + '}';
    }
    
    
}
