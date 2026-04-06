package edu.pucmm.eict.abstraction;

import edu.pucmm.eict.implementation.Color;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujando Circulo. ");
        color.fill();
    }
}
