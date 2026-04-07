package edu.pucmm.eict;

import edu.pucmm.eict.factory.CircleFactory;
import edu.pucmm.eict.flyweight.Circle;

public class Main {
    private static final String[] colors = {"Rojo", "Verde", "Azul", "Blanco", "Negro"};

    static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle = CircleFactory.getCircle(getRandomColor());
            circle.setPosition(getRandomX(), getRandomY());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
