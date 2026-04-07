package edu.pucmm.eict.flyweight;

public class ConcreteCircle implements Circle {
    private String color;
    private int x;
    private int y;

    public ConcreteCircle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un circulo " + color + " en la posicion (" + x + ", " + y + ")");
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
