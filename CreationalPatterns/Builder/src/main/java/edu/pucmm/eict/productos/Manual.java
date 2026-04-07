package edu.pucmm.eict.productos;

public class Manual {
    private final String carType;
    private final int seats;
    private final String engine;
    private final String transmission;
    private final boolean hasTripComputer;
    private final boolean hasGpsNavigator;

    public Manual(String carType, int seats, String engine, String transmission, boolean hasTripComputer, boolean hasGpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.hasTripComputer = hasTripComputer;
        this.hasGpsNavigator = hasGpsNavigator;
    }

    public String print() {
        return "Manual del Auto:\n" +
                " - Tipo: " + carType + "\n" +
                " - Asientos: " + seats + "\n" +
                " - Motor: " + engine + "\n" +
                " - Transmision: " + transmission + "\n" +
                " - Computadora de viaje: " + (hasTripComputer ? "Si" : "No") + "\n" +
                " - GPS: " + (hasGpsNavigator ? "Si" : "No") + "\n";
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
