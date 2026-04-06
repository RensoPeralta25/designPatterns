package edu.pucmm.eict.adapter;

public class FahrenheitSensor {
    private double temperature;

    public FahrenheitSensor(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperatureFahrenheit() {
        return temperature;
    }
}
