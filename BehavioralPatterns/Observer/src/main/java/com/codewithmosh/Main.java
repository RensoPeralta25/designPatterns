package com.codewithmosh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]) {
        JobSeeker renso = new JobSeeker("Renso Peralta");
        JobSeeker adrian = new JobSeeker("Adrian Cruz");
        JobSeeker goat = new JobSeeker("Jose M. Compres");

        EmployAgency agency = new EmployAgency();
        agency.attach(renso);
        agency.attach(adrian);
        agency.attach(goat);

        agency.addJob(new JobPost("Ingenieria en Ciencias de la Computacion"));

    }
}
