package com.codewithmosh;

class CoffeeMachine {
    private CoffeeMachineState idleState;
    private CoffeeMachineState selectingState;
    private CoffeeMachineState dispensingState;

    private CoffeeMachineState currentState;

    public CoffeeMachine() {
        idleState = new IdleState(this);
        selectingState = new SelectionState(this);
        dispensingState = new DispensingState(this);

        currentState = idleState;
    }

    public void setState(CoffeeMachineState state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertcoin();
    }

    public void selectCoffee() {
        currentState.selectCoffee();
    }

    public void dispenseCoffee() {
        currentState.dispenseCoffee();
    }

    public CoffeeMachineState getSelectingState() {
        return selectingState;
    }

    public CoffeeMachineState getDispensingState() {
        return dispensingState;
    }

    public CoffeeMachineState getIdleState() {
        return idleState;
    }
}
