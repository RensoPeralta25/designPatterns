package edu.pucmm.eict.subsystem;

public class SoundSystem {
    public void on() {
        System.out.println("Sistema de sonido encendido");
    }
    public void off() {
        System.out.println("Sistema de sonido apagado");
    }
    public void setVolume(int level) {
        System.out.println("Volumen del sistema de sonido configurado al nivel: " + level);
    }
}
