package edu.pucmm.eict.productos_concretos;

import edu.pucmm.eict.productos.Checkbox;

public class CheckboxMac implements Checkbox {
    @Override
    public void marcar(){
        System.out.println("Marcando checkbox para Mac");
    }
}
