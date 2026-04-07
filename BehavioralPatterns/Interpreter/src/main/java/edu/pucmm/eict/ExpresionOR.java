package edu.pucmm.eict;

class ExpresionOR implements Expresion {
    private Expresion expr1;
    private Expresion expr2;

    public ExpresionOR(Expresion expr1, Expresion expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return expr1.interpretar(contexto) || expr2.interpretar(contexto);
    }
}
