package edu.pucmm.eict;

class Variable implements Expresion {
    private String nombre;

    public Variable(String nombre) { this.nombre = nombre; }

    @Override
    public boolean interpretar(Contexto contexto) {
        return contexto.getVariable(nombre);
    }
}
