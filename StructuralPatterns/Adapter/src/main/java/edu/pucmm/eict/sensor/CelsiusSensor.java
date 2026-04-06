package edu.pucmm.eict.sensor;

public class CelsiusSensor implements TemperatureSensor {
    private double temperature;

    public CelsiusSensor(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperatureCelsius() {
        return temperature;
    }

    @Override
    public boolean isOverheating() {
        return temperature > 80.0;
    }
}
