package org.example.Alta_Cohesion;



public class Pedido {

    private String producto;
    private int cantidad;

    public Pedido(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularTotal(double precioUnitario) {
        return precioUnitario * cantidad;
    }
}
