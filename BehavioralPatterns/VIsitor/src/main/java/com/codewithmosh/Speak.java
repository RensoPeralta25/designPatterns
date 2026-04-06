package com.codewithmosh;

public class Speak implements AnimalVisitor {

    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Monkey hablo.");
    }

    @Override
    public void visitLion(Lion lion) {
        System.out.println("Lion hablo.");
    }

    @Override
    public void visitDolphin(Dolphin dolphin) {
        System.out.println("Delfin hablo.");
    }
}
