package org.example.Baja_Cohesion;

public class SistemaPedido {

    public void crearPedido(String producto, int cantidad) {
        System.out.println("Pedido creado: " + producto + " x" + cantidad);
    }

    public void calcularTotal(double precio, int cantidad) {
        System.out.println("Total: " + (precio * cantidad));
    }

    public void guardarEnBaseDatos() {
        System.out.println("Guardando pedido en la base de datos");
    }

    public void enviarEmailConfirmacion() {
        System.out.println("Enviando email de confirmación");
    }
}
