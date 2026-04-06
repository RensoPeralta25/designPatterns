package edu.pucmm.eict.creadores_concretos;

import edu.pucmm.eict.creador.NotificationService;
import edu.pucmm.eict.producto.Notification;
import edu.pucmm.eict.productos_concretos.EmailNotification;

public class EmailService extends NotificationService {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
