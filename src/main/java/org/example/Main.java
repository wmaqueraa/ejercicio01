package org.example;

import org.example.Alta_Cohesion.NotificadorEmail;
import org.example.Alta_Cohesion.Pedido;
import org.example.Alta_Cohesion.PedidoRepository;
import org.example.Alta_Cohesion.ServicioPedido;
import org.example.Baja_Cohesion.SistemaPedido;
import org.example.Bajo_Acoplamiento.NotificadorEmailImplementacion;
import org.example.Bajo_Acoplamiento.NotificadorInterface;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 01 : ACOMPLAMIENTO ::::::::::::::::::::::::::::::::::::::");

        NotificadorEmailImplementacion notificadorEmail = new NotificadorEmailImplementacion();
        ServicioNotificacionBajoA servicio = new ServicioNotificacionBajoA(notificadorEmail);

        servicio.notificar("1.- Pedido entregado correctamente BAJO ACOPLAMIENTO");


        ServicioNotificacionAltoA servicioAA = new ServicioNotificacionAltoA();
        servicioAA.notificar("2.- Pedido Entregado correctamente ALTO ACOPLAMIENTO");

        System.out.println("EJERCICIO 01 : COHESION :::::::::::::::::::::::::::::::::::::::");
        System.out.println("3.- Generar Pedido de Producto BAJA COHESION ");
        SistemaPedido sistema = new SistemaPedido();
        sistema.crearPedido("Bolsa de Azucar", 10);
        sistema.calcularTotal(3,10);
        sistema.guardarEnBaseDatos();
        sistema.enviarEmailConfirmacion();


        System.out.println("4.- Generar Pedido de Producto ALTA COHESION ");
        Pedido pedido = new Pedido("Libro JUEGOS DE TRONOS", 3);

        PedidoRepository repository = new PedidoRepository();
        NotificadorEmail notificadorAC = new NotificadorEmail();
        ServicioPedido servicioAC = new ServicioPedido(repository, notificadorAC);
        servicioAC.procesarPedido(pedido, 15.0);
    }
}