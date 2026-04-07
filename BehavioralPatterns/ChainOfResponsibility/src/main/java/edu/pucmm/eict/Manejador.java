package edu.pucmm.eict;

public interface Manejador {
    Manejador setSiguiente(Manejador manejador);
    boolean procesar(String email, String password);
}
