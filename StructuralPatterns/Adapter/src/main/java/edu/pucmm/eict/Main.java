package edu.pucmm.eict;

import edu.pucmm.eict.adapter.FahrenheitAdapter;
import edu.pucmm.eict.adapter.FahrenheitSensor;
import edu.pucmm.eict.sensor.CelsiusSensor;

public class Main {
    static void main() {
        CelsiusSensor celsiusSensor = new CelsiusSensor(75.0);
        System.out.println(celsiusSensor.getTemperatureCelsius());
        System.out.println(celsiusSensor.isOverheating());

        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor(212.0);
        FahrenheitAdapter adapter = new FahrenheitAdapter(fahrenheitSensor);
        System.out.println(adapter.getTemperatureCelsius());
        System.out.println(adapter.isOverheating());
    }
}
