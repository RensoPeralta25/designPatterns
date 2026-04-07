package edu.pucmm.eict;

public class LabDoor implements Door {
    @Override
    public void open(String password) {
        System.out.println("Abriendo la puerta del laboratorio...");
    }

    @Override
    public void close() {
        System.out.println("Cerrando la puerta del laboratorio...");
    }
}
