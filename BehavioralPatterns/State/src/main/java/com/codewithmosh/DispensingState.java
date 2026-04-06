package com.codewithmosh;

public class DispensingState implements CoffeeMachineState {

    private CoffeeMachine coffeeMachine;

    public DispensingState (CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertcoin() {
        System.out.println("El cafe se esta haciendo, no repita la operacion");
    }

    @Override
    public void selectCoffee() {
        System.out.println("El cafe se esta haciendo, no repita la operacion");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("El cafe esta listo, por favor tomelo");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }
}
