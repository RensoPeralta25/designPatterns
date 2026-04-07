package edu.pucmm.eict.prototipos;

public class Mago implements EnemigoPrototipo {
    private String hechizo;
    private int mana;

    public Mago(String hechizo, int mana) {
        this.hechizo = hechizo;
        this.mana = mana;
    }

    private Mago(Mago target) {
        this.hechizo = target.hechizo;
        this.mana = target.mana;
    }

    @Override
    public EnemigoPrototipo clonar() {
        return new Mago(this);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mago lanza " + hechizo + ", Mana: " + mana);
    }
}