package edu.pucmm.eict.director;

import edu.pucmm.eict.builder.Builder;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setCarType("Auto Deportivo");
        builder.setSeats(2);
        builder.setEngine("V8 3.0L");
        builder.setTransmission("Semi-Automatica");
        builder.setTripComputer(true);
        builder.setGPSNavigator(true);
    }

    public void constructCityCar(Builder builder) {
        builder.reset();
        builder.setCarType("Auto de Ciudad");
        builder.setSeats(4);
        builder.setEngine("1.2L Economico");
        builder.setTransmission("Automatica");
        builder.setTripComputer(false);
        builder.setGPSNavigator(true);
    }
}
