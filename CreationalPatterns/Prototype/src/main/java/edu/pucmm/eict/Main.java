package edu.pucmm.eict;

import edu.pucmm.eict.prototipos.EnemigoPrototipo;
import edu.pucmm.eict.prototipos.Guerrero;
import edu.pucmm.eict.prototipos.Mago;

public class Main {
    static void main() {
        Guerrero guerreroOriginal = new Guerrero("Espada de Bronce", 100, "Cota de Malla");
        Mago magoOriginal = new Mago("Rayo de Escarcha", 50);

        EnemigoPrototipo clonGuerrero1 = guerreroOriginal.clonar();
        EnemigoPrototipo clonGuerrero2 = guerreroOriginal.clonar();
        EnemigoPrototipo clonMago = magoOriginal.clonar();

        guerreroOriginal.mostrarInfo();
        clonGuerrero1.mostrarInfo();
        clonGuerrero2.mostrarInfo();
        clonMago.mostrarInfo();

        System.out.println("\nEl guerrero original y el clon 1 son el mismo objeto en memoria?");
        System.out.println(guerreroOriginal == clonGuerrero1);
    }
}
