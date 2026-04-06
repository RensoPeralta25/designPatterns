package edu.pucmm.eict;

import edu.pucmm.eict.abstraction.Circle;
import edu.pucmm.eict.abstraction.Shape;
import edu.pucmm.eict.abstraction.Square;
import edu.pucmm.eict.implementation.Green;
import edu.pucmm.eict.implementation.Red;

public class Main {
    static void main() {
        Shape redCircle = new Circle(new Red());
        Shape greenSquare = new Square(new Green());

        redCircle.draw();
        greenSquare.draw();
    }
}
