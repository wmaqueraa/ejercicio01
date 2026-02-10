package org.example;

import org.example.Bajo_Acoplamiento.NotificadorEmailImplementacion;
import org.example.Bajo_Acoplamiento.NotificadorInterface;

public class ServicioNotificacionBajoA {

    private NotificadorEmailImplementacion notificador;

    public ServicioNotificacionBajoA(NotificadorEmailImplementacion notificador) {
        this.notificador = notificador;
    }

    public void notificar(String mensaje) {
        notificador.enviar(mensaje);

    }
}
