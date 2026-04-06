package edu.pucmm.eict;

import edu.pucmm.eict.component.Coffee;
import edu.pucmm.eict.component.SimpleCoffee;
import edu.pucmm.eict.decorator.MilkDecorator;
import edu.pucmm.eict.decorator.SugarDecorator;

public class Main {
    static void main() {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}
