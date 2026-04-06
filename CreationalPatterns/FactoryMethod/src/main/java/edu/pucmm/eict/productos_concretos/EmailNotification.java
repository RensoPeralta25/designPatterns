package edu.pucmm.eict.productos_concretos;

import edu.pucmm.eict.producto.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Enviando notificacion por EMAIL");
    }
}
