package edu.pucmm.eict;

import edu.pucmm.eict.creador.NotificationService;
import edu.pucmm.eict.creadores_concretos.EmailService;
import edu.pucmm.eict.creadores_concretos.SmsService;

public class Main {
    static void main() {
        NotificationService service = new EmailService();
        service.notifyUser();

        service = new SmsService();
        service.notifyUser();
    }
}
