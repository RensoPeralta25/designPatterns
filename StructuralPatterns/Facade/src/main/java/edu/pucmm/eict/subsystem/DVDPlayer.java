package edu.pucmm.eict.subsystem;

public class DVDPlayer {
    public void on() {
        System.out.println("Reproductor DVD encendido");
    }
    public void play(String movie) {
        System.out.println("Reproduciendo pelicula: " + movie);
    }
    public void off() {
        System.out.println("Reproductor DVD apagado");
    }
}
