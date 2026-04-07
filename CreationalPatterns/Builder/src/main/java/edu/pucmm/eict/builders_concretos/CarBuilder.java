package edu.pucmm.eict.builders_concretos;

import edu.pucmm.eict.builder.Builder;
import edu.pucmm.eict.productos.Car;

public class CarBuilder implements Builder {
    private String type;
    private int seats;
    private String engine;
    private String transmission;
    private boolean tripComputer;
    private boolean gpsNavigator;

    @Override
    public void reset() {
        this.type = "";
        this.seats = 0;
        this.engine = "";
        this.transmission = "";
        this.tripComputer = false;
        this.gpsNavigator = false;
    }

    @Override public void setCarType(String type) { this.type = type; }
    @Override public void setSeats(int seats) { this.seats = seats; }
    @Override public void setEngine(String engine) { this.engine = engine; }
    @Override public void setTransmission(String transmission) { this.transmission = transmission; }
    @Override public void setTripComputer(boolean hasTripComputer) { this.tripComputer = hasTripComputer; }
    @Override public void setGPSNavigator(boolean hasGpsNavigator) { this.gpsNavigator = hasGpsNavigator; }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
