
package com.mycompany.inventariostorepi.inventario;

public interface IInventarios {
    
    public boolean agregarProducto (Inventario inventario);
    public void imprimirProductos ();
    public void buscarProductoCodigo(int buscarCodigo);
    public boolean editarProducto(int i, Inventario inventario );
    public boolean eliminarProducto (int i, Inventario inventario );
    public void calcularInventarioTotal ();
}
