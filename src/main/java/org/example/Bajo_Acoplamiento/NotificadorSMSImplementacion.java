package org.example.Bajo_Acoplamiento;


public class NotificadorSMSImplementacion implements NotificadorInterface {
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
