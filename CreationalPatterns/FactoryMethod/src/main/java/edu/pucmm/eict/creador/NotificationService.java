package edu.pucmm.eict.creador;

import edu.pucmm.eict.producto.Notification;

public abstract class NotificationService {
    public abstract Notification createNotification();

    public void notifyUser() {
        Notification notification = createNotification();
        notification.send();
    }
}