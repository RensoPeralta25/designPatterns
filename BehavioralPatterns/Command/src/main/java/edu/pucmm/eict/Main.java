package edu.pucmm.eict;

public class Main {
    static void main() {
        EditorTexto miEditor = new EditorTexto();

        Comando cmdCopiar = new ComandoCopiar(miEditor, "Hello, hello, goodbye");
        Comando cmdPegar = new ComandoPegar(miEditor);

        Boton btnCopiar = new Boton();
        Boton btnPegar = new Boton();

        btnCopiar.setComando(cmdCopiar);
        btnPegar.setComando(cmdPegar);

        System.out.println("Usuario presiona el boton Copiar");
        btnCopiar.hacerClick();

        System.out.println("\nUsuario presiona el boton Pegar");
        btnPegar.hacerClick();
    }
}
