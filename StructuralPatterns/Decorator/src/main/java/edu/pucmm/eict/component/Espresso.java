package edu.pucmm.eict.component;

public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Expresso";
    }
}
