package edu.pucmm.eict;

//RECEIVER
public class EditorTexto {
    private String portapapeles = "";

    public void copiar(String texto) {
        this.portapapeles = texto;
        System.out.println("Receptor: Copiando al portapapeles: '" + texto + "'");
    }

    public void pegar() {
        System.out.println("Receptor: Pegando el texto: '" + portapapeles + "'");
    }
}
