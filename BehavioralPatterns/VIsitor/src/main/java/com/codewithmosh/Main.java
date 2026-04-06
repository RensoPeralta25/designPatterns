package com.codewithmosh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]) {
        Animal monkey = new Monkey();
        Animal lion = new Lion();
        Animal dolphin = new Dolphin();

        AnimalVisitor speak = new Speak();

        monkey.accept(speak);
        lion.accept(speak);
        dolphin.accept(speak);
    }
}
