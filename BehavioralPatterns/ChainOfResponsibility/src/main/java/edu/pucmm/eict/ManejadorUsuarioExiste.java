package edu.pucmm.eict;

public class ManejadorUsuarioExiste extends ManejadorBase {
    @Override
    public boolean procesar(String email, String password) {
        if (!email.equals("admin@empresa.com") && !email.equals("user@empresa.com")) {
            System.out.println("El usuario no esta registrado.");
            return false;
        }
        System.out.println("Usuario encontrado.");
        return pasarAlSiguiente(email, password);
    }
}