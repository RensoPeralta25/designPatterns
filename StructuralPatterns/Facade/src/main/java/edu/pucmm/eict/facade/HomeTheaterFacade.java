package edu.pucmm.eict.facade;

import edu.pucmm.eict.subsystem.DVDPlayer;
import edu.pucmm.eict.subsystem.Projector;
import edu.pucmm.eict.subsystem.Screen;
import edu.pucmm.eict.subsystem.SoundSystem;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparate para ver la pelicula...");
        screen.up();
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Apagando el cine en casa...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.down();
    }
}
