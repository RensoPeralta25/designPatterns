package com.codewithmosh;

import com.codewithmosh.Impl.CareTaker;
import com.codewithmosh.Impl.TextEditor;

public class Main {
    public static void main(String args[]) {
        TextEditor textEditor = new TextEditor();
        CareTaker careTaker = new CareTaker();

        textEditor.type("Hola ");
        careTaker.addMemento(textEditor.save());

        textEditor.type("Mundo");
        careTaker.addMemento(textEditor.save());

        textEditor.restore(careTaker.getMemento(0));
        System.out.println("Primer contenido salvado: " + textEditor.getContent());

        textEditor.restore(careTaker.getMemento(1));
        System.out.println("Segundo contenido salvado: " + textEditor.getContent());

    }
}
