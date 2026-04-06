package com.codewithmosh;

public class SelectionState implements CoffeeMachineState {

    private CoffeeMachine coffeeMachine;

    public SelectionState (CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertcoin() {
        System.out.println("Por favor no inserte la moneda otra vez. Seleccione el cafe");
    }

    @Override
    public void selectCoffee() {
        System.out.println("El cafe se esta haciendo...");
        coffeeMachine.setState(coffeeMachine.getDispensingState());
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Seleccione el cafe primero.");
    }
}
