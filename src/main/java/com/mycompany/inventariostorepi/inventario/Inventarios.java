package com.mycompany.inventariostorepi.inventario;

public class Inventarios implements IInventarios {

    private Inventario[] inventarios;
    private int totalInventarios;

    public Inventarios() {
    }

    
    public Inventarios(int dimension) {
        inventarios = new Inventario[dimension];
        totalInventarios = 0;
    }

    public boolean agregarProducto(Inventario inventario) {
        if (totalInventarios == inventarios.length) {
            return false;
        } else {
            inventarios[totalInventarios] = inventario;
            totalInventarios = totalInventarios + 1;
            return true;
        }
    }

    @Override
    public void imprimirProductos() {
        for (int i = 0; i < totalInventarios; i++) {
            System.out.println("Producto |" + (i + 1) + "|");
            System.out.println("Marca: " + inventarios[i].getMarca());
            System.out.println("Codigo: " + inventarios[i].getCodigoProducto());
            System.out.println("Talla: " + inventarios[i].getTalla());            
            System.out.println("Color: " + inventarios[i].getColor());            
            System.out.println("Cantidad: " + inventarios[i].getCantidad());
            System.out.println("Precio: " + inventarios[i].getPrecio());
            System.out.println(" ");

        }
    }

    public void buscarProductoCodigo(int buscarCodigo) {
        boolean encontrar = false;
        for (int i = 0; i < totalInventarios; i++) {
            if (inventarios[i].getCodigoProducto() == buscarCodigo) {
                System.out.println("Su producto es: " + inventarios[i].getNombre());
                System.out.println("Cantidad: " + inventarios[i].getCantidad());
                System.out.println("Precio: " + inventarios[i].getPrecio());
                encontrar = true;
            } 
        }
        if ( ! encontrar){
            System.out.println("Error: producto no encontrado");
        }
    }

    public boolean editarProducto(int i, Inventario inventario ) {
        inventarios [i]= inventario;
        return true; 
    }
    
    public boolean eliminarProducto (int i, Inventario inventario ){
        inventarios [i]= inventario;
        return true; 
    }
    public void calcularInventarioTotal() {
    int sumaCantidad = 0;
    double sumaPrecio = 0.0;

    for (int i = 0; i < totalInventarios; i++) {
        sumaCantidad += inventarios[i].getCantidad();
        sumaPrecio += inventarios[i].getCantidad() * inventarios[i].getPrecio();
    }

    System.out.println("Cantidad Total de Productos: " + sumaCantidad);
    System.out.println("Total Dinero del Inventario: $" + sumaPrecio);
}

}
