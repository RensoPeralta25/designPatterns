package edu.pucmm.eict;

public class ManejadorContrasena extends ManejadorBase {
    @Override
    public boolean procesar(String email, String password) {
        if (!password.equals("1234")) {
            System.out.println("Contrasena incorrecta.");
            return false;
        }
        System.out.println("Contrasena correcta.");
        return pasarAlSiguiente(email, password);
    }
}
