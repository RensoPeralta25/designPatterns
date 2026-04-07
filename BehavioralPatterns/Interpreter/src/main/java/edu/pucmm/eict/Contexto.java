package edu.pucmm.eict;

import java.util.HashMap;
import java.util.Map;

class Contexto {
    private Map<String, Boolean> variables = new HashMap<>();

    public void setVariable(String nombre, boolean valor) {
        variables.put(nombre, valor);
    }

    public boolean getVariable(String nombre) {
        return variables.getOrDefault(nombre, false);
    }
}
