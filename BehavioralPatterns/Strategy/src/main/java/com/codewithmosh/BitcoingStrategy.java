package com.codewithmosh;

public class BitcoingStrategy implements PaymentStrategy {

    private String walletAddres;

    public BitcoingStrategy (String walletAddres) {
        this.walletAddres =  walletAddres;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin.");
    }
}
