package edu.pucmm.eict;

//Esto es más para ahorrar código, como pasar al siguiente
public abstract class ManejadorBase implements Manejador {
    private Manejador siguiente;

    @Override
    public Manejador setSiguiente(Manejador manejador) {
        this.siguiente = manejador;
        return manejador;
    }

    protected boolean pasarAlSiguiente(String email, String password) {
        if (siguiente == null) {
            return true;
        }
        return siguiente.procesar(email, password);
    }
}
