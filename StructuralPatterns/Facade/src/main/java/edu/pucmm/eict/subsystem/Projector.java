package edu.pucmm.eict.subsystem;

public class Projector {
    public void on() {
        System.out.println("Proyector encendido");
    }
    public void off() {
        System.out.println("Proyector apagado");
    }
    public void setInput(String input) {
        System.out.println("Entrada del proyector configurada en: " + input);
    }
}
