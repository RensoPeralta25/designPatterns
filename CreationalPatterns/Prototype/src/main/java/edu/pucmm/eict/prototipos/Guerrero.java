package edu.pucmm.eict.prototipos;

public class Guerrero implements EnemigoPrototipo {
    private String arma;
    private int salud;
    private String armaduraPesadaPrivada;

    public Guerrero(String arma, int salud, String armaduraPesadaPrivada) {
        this.arma = arma;
        this.salud = salud;
        this.armaduraPesadaPrivada = armaduraPesadaPrivada;
    }

    private Guerrero(Guerrero target) {
        this.arma = target.arma;
        this.salud = target.salud;
        this.armaduraPesadaPrivada = target.armaduraPesadaPrivada;
    }

    @Override
    public EnemigoPrototipo clonar() {
        return new Guerrero(this);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Guerrero con " + arma + ", Salud: " + salud + ", Armadura: " + armaduraPesadaPrivada);
    }
}
