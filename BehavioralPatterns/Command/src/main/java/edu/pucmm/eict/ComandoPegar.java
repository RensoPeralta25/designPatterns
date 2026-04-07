package edu.pucmm.eict;

public class ComandoPegar implements Comando {
    private EditorTexto editor;

    public ComandoPegar(EditorTexto editor) {
        this.editor = editor;
    }

    @Override
    public void ejecutar() {
        editor.pegar();
    }
}
