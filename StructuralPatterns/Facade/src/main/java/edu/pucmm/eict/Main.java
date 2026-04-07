package edu.pucmm.eict;

import edu.pucmm.eict.facade.HomeTheaterFacade;
import edu.pucmm.eict.subsystem.DVDPlayer;
import edu.pucmm.eict.subsystem.Projector;
import edu.pucmm.eict.subsystem.Screen;
import edu.pucmm.eict.subsystem.SoundSystem;

public class Main {
    static void main() {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, screen);

        homeTheaterFacade.watchMovie("Barbie");
        homeTheaterFacade.endMovie();
    }
}
