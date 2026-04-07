package edu.pucmm.eict.productos;

public class Car {
    private final String carType;
    private final int seats;
    private final String engine;
    private final String transmission;
    private final boolean hasTripComputer;
    private final boolean hasGpsNavigator;

    public Car(String carType, int seats, String engine, String transmission, boolean hasTripComputer, boolean hasGpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.hasTripComputer = hasTripComputer;
        this.hasGpsNavigator = hasGpsNavigator;
    }

    public String getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean isHasTripComputer() {
        return hasTripComputer;
    }

    public boolean isHasGpsNavigator() {
        return hasGpsNavigator;
    }
}
