package edu.pucmm.eict;

import edu.pucmm.eict.builders_concretos.CarBuilder;
import edu.pucmm.eict.builders_concretos.ManualBuilder;
import edu.pucmm.eict.director.Director;
import edu.pucmm.eict.productos.Car;
import edu.pucmm.eict.productos.Manual;

public class Main {
    static void main() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Auto construido: " + car.getCarType());

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportsCar(manualBuilder);

        Manual carManual = manualBuilder.getResult();
        System.out.println(carManual.print());
    }
}
