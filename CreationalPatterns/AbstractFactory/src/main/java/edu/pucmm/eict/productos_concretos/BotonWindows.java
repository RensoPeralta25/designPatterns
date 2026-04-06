package edu.pucmm.eict.productos_concretos;

import edu.pucmm.eict.productos.Boton;

public class BotonWindows implements Boton {
    @Override
    public void pintar(){
        System.out.println("Pintando boton para Windows");
    }
}
