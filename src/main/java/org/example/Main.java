package org.example;

import org.example.Baja_Cohesion.SistemaPedido;
import org.example.Bajo_Acoplamiento.NotificadorEmailImplementacion;
import org.example.Bajo_Acoplamiento.NotificadorInterface;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 01 : ACOMPLAMIENTO ::::::::::::::::::::::::::::::::::::::");

        NotificadorInterface notificador = new NotificadorEmailImplementacion();
        ServicioNotificacionBajoA servicio = new ServicioNotificacionBajoA(notificador);

        servicio.notificar("1. - Pedido entregado correctamente BAJO ACOPLAMIENTO");


        ServicioNotificacionAltoA servicioAA = new ServicioNotificacionAltoA();
        servicioAA.notificar("2. - Pedido Entregado correctamente ALTO ACOPLAMIENTO");

        System.out.println("EJERCICIO 01 : COHESION :::::::::::::::::::::::::::::::::::::::");
        SistemaPedido sistema = new SistemaPedido();
        sistema.crearPedido("Bolsa de Azucar", 10);
        sistema.calcularTotal(3,10);
        sistema.guardarEnBaseDatos();
        sistema.enviarEmailConfirmacion();
    }
}