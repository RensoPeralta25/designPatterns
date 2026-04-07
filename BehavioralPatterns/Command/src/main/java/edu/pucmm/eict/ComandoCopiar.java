package edu.pucmm.eict;

public class ComandoCopiar implements Comando {
    private EditorTexto editor;
    private String textoACopiar;

    public ComandoCopiar(EditorTexto editor, String textoACopiar) {
        this.editor = editor;
        this.textoACopiar = textoACopiar;
    }

    @Override
    public void ejecutar() {
        editor.copiar(textoACopiar);
    }
}
