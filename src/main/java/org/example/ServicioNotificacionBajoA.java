package org.example;

import org.example.Bajo_Acoplamiento.NotificadorInterface;

public class ServicioNotificacionBajoA {

    private NotificadorInterface notificador;

    public ServicioNotificacionBajoA(NotificadorInterface notificador) {
        this.notificador = notificador;
    }

    public void notificar(String mensaje) {
        notificador.enviar(mensaje);
    }
}
