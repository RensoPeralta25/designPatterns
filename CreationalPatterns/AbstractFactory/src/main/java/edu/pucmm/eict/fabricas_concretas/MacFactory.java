package edu.pucmm.eict.fabricas_concretas;

import edu.pucmm.eict.fabrica.GUIFactory;
import edu.pucmm.eict.productos.Boton;
import edu.pucmm.eict.productos.Checkbox;
import edu.pucmm.eict.productos_concretos.BotonMac;
import edu.pucmm.eict.productos_concretos.CheckboxMac;

public class MacFactory implements GUIFactory {
    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new CheckboxMac();
    }
}
