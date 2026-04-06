package com.codewithmosh;

public interface AnimalVisitor {
    void visitMonkey (Monkey monkey);
    void visitLion (Lion lion);
    void visitDolphin (Dolphin dolphin);

}
