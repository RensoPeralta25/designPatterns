package edu.pucmm.eict.adapter;

import edu.pucmm.eict.sensor.TemperatureSensor;

public class FahrenheitAdapter implements TemperatureSensor {
    private FahrenheitSensor sensor;

    public FahrenheitAdapter(FahrenheitSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureCelsius() {
        return (sensor.getTemperatureFahrenheit() - 32) * 5 / 9;
    }

    @Override
    public boolean isOverheating() {
        return getTemperatureCelsius() > 80.0;
    }
}
