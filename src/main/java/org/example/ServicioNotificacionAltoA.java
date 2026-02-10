package org.example;

import org.example.Alto_Acomplamiento.EmailService;

public class ServicioNotificacionAltoA {


    private EmailService emailService = new EmailService();

    public void notificar(String mensaje) {
        emailService.enviarEmail(mensaje);

    }
}