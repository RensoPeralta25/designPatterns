package com.codewithmosh;

public class IdleState implements CoffeeMachineState {

    private CoffeeMachine coffeeMachine;

    public IdleState (CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertcoin() {
        System.out.println("Moneda insertada. Por favor selecciona el cafe.");
        coffeeMachine.setState(coffeeMachine.getSelectingState());
    }

    @Override
    public void selectCoffee() {
        System.out.println("Por favor inserta la moneda primero");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Por favor inserta la moneda y selecciona el cafe");
    }
}
