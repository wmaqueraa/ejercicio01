package org.example.Bajo_Acoplamiento;

public class NotificadorEmailImplementacion implements NotificadorInterface {

    @Override
    public void enviar(String mensaje) {
        System.out.println("     Enviando email: " + mensaje);
    }
}
