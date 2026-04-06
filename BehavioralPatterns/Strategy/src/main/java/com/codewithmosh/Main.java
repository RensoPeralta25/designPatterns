package com.codewithmosh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CreditCardStrategy("1234-5678-9012-3456"));

        cart.pay(new PaypalStrategy("miemail@gmail.com"));

        cart.pay(new BitcoingStrategy("bitcoinAddress"));

    }
}
