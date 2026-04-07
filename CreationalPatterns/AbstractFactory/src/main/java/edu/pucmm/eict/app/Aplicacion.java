package edu.pucmm.eict.app;

import edu.pucmm.eict.fabrica.GUIFactory;
import edu.pucmm.eict.productos.Boton;
import edu.pucmm.eict.productos.Checkbox;

public class Aplicacion {
    Boton boton;
    Checkbox checkbox;

    public Aplicacion (GUIFactory fabrica) {
        boton = fabrica.crearBoton();
        checkbox = fabrica.crearCheckbox();
    }

    public void renderizarUI() {
        boton.pintar();
        checkbox.marcar();
    }
}
