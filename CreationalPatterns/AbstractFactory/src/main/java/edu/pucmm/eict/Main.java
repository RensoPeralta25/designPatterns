package edu.pucmm.eict;

import edu.pucmm.eict.app.Aplicacion;
import edu.pucmm.eict.fabrica.GUIFactory;
import edu.pucmm.eict.fabricas_concretas.MacFactory;
import edu.pucmm.eict.fabricas_concretas.WindowsFactory;

public class Main {
    public static Aplicacion configurarAplicacion() {
        Aplicacion app;
        GUIFactory fabrica;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            fabrica = new MacFactory();
        } else {
            fabrica = new WindowsFactory();
        }
        app = new Aplicacion(fabrica);
        return app;
    }

    static void main() {
        Aplicacion app = configurarAplicacion();
        app.renderizarUI();
    }
}
