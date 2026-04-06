package edu.pucmm.eict.sensor;

public interface TemperatureSensor {
    double getTemperatureCelsius();
    boolean isOverheating();
}
