package edu.pucmm.eict;

public class Main {
    static void main() {
        Contexto contexto = new Contexto();
        contexto.setVariable("EsAdmin", false);
        contexto.setVariable("EsGerente", true);
        contexto.setVariable("TieneAprobacion", true);

        Expresion esAdmin = new Variable("EsAdmin");
        Expresion esGerente = new Variable("EsGerente");
        Expresion tieneAprobacion = new Variable("TieneAprobacion");

        Expresion adminOgerente = new ExpresionOR(esAdmin, esGerente);
        Expresion reglaFinal = new ExpresionAND(adminOgerente, tieneAprobacion);

        boolean resultado = reglaFinal.interpretar(contexto);
        System.out.println("Puede acceder al sistema? " + resultado);
    }
}
