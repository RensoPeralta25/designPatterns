package com.codewithmosh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]) {
        CaffeeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("---------------------");

        CaffeeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
