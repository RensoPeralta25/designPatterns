package com.codewithmosh;

public class Monkey implements Animal {

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitMonkey(this);
    }
}
