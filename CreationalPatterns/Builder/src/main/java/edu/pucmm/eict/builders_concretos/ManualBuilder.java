package edu.pucmm.eict.builders_concretos;

import edu.pucmm.eict.builder.Builder;
import edu.pucmm.eict.productos.Manual;

public class ManualBuilder implements Builder {
    private String type;
    private int seats;
    private String engine;
    private String transmission;
    private boolean tripComputer;
    private boolean gpsNavigator;

    @Override
    public void reset() { /* Limpieza similar... */ }

    @Override public void setCarType(String type) { this.type = type; }
    @Override public void setSeats(int seats) { this.seats = seats; }
    @Override public void setEngine(String engine) { this.engine = engine; }
    @Override public void setTransmission(String transmission) { this.transmission = transmission; }
    @Override public void setTripComputer(boolean hasTripComputer) { this.tripComputer = hasTripComputer; }
    @Override public void setGPSNavigator(boolean hasGpsNavigator) { this.gpsNavigator = hasGpsNavigator; }

    // Este método es exclusivo de este Builder concreto y devuelve un producto distinto
    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
