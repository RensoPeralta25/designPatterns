package edu.pucmm.eict.abstraction;

import edu.pucmm.eict.implementation.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujando Cuadrado. ");
        color.fill();
    }
}
