package edu.pucmm.eict.fabricas_concretas;

import edu.pucmm.eict.fabrica.GUIFactory;
import edu.pucmm.eict.productos.Boton;
import edu.pucmm.eict.productos.Checkbox;
import edu.pucmm.eict.productos_concretos.BotonWindows;
import edu.pucmm.eict.productos_concretos.CheckboxWindows;

public class WindowsFactory implements GUIFactory {
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new CheckboxWindows();
    }
}
