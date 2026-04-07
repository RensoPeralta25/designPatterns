package edu.pucmm.eict;

public class ManejadorRol extends ManejadorBase {
    @Override
    public boolean procesar(String email, String password) {
        if (email.equals("admin@empresa.com")) {
            System.out.println("Bienvenido Administrador. Tienes acceso total.");
            return pasarAlSiguiente(email, password);
        }
        System.out.println("Bienvenido Usuario. Tienes acceso limitado.");
        return pasarAlSiguiente(email, password);
    }
}
