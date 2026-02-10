package org.example.Alto_Acomplamiento;

public class ServicioNotificacion {

    private EmailService emailService = new EmailService();

    public void notificar(String mensaje) {
        emailService.enviarEmail(mensaje);
    }
}