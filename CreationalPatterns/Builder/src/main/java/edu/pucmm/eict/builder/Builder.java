package edu.pucmm.eict.builder;

public interface Builder {
    void reset();
    void setCarType(String type);
    void setSeats(int seats);
    void setEngine(String engine);
    void setTransmission(String transmission);
    void setTripComputer(boolean hasTripComputer);
    void setGPSNavigator(boolean hasGpsNavigator);
}
