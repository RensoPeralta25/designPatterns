package edu.pucmm.eict;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        AppConfig a = AppConfig.getInstance();
        AppConfig b = AppConfig.getInstance();

        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        b.setTheme("dark");
        System.out.println(a.getTheme());
    }
}
