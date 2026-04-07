package edu.pucmm.eict.factory;

import edu.pucmm.eict.flyweight.Circle;
import edu.pucmm.eict.flyweight.ConcreteCircle;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {
    private static final Map<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new ConcreteCircle(color);
            circleMap.put(color, circle);
            System.out.println("---- Creando un nuevo objeto circulo de color: " + color + " ---");
        }

        return circle;
    }
}
