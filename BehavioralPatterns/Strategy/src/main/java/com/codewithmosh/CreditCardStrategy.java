package com.codewithmosh;

public class CreditCardStrategy implements PaymentStrategy {

    private String cardnumber;

    public CreditCardStrategy (String cardnumber) {
        this.cardnumber = cardnumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
