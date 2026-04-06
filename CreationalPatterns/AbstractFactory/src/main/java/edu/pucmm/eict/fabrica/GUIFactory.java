package edu.pucmm.eict.fabrica;

import edu.pucmm.eict.productos.Boton;
import edu.pucmm.eict.productos.Checkbox;

public interface GUIFactory {
    Boton crearBoton();
    Checkbox crearCheckbox();
}
