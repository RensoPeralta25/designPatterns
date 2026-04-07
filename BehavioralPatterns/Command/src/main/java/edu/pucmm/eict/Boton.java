package edu.pucmm.eict;

//INVOKER
public class Boton {
    private Comando comandoAsignado;

    public void setComando(Comando comando) {
        this.comandoAsignado = comando;
    }

    public void hacerClick() {
        if (comandoAsignado != null) {
            comandoAsignado.ejecutar();
        }
    }
}
