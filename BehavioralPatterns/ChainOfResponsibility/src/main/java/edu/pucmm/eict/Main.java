package edu.pucmm.eict;

public class Main {
    static void main() {
        Manejador manejadorSeguridad = new ManejadorUsuarioExiste();

        manejadorSeguridad
                .setSiguiente(new ManejadorContrasena())
                .setSiguiente(new ManejadorRol());

        manejadorSeguridad.procesar("hacker@mail.com", "1234");
        manejadorSeguridad.procesar("admin@empresa.com", "clave_mala");
        manejadorSeguridad.procesar("admin@empresa.com", "1234");
    }
}
