package edu.pucmm.eict;

public class Main {
    static void main() {
        Door door = new SecuredDoor(new LabDoor());

        door.open("invalida");
        door.open("$ecr@t");

        door.close();
    }
}
