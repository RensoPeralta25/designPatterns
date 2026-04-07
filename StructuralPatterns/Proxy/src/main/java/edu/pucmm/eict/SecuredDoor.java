package edu.pucmm.eict;

public class SecuredDoor implements Door {
    private Door door;

    public SecuredDoor(Door door) {
        this.door = door;
    }

    @Override
    public void open(String password) {
        if (authenticate(password)) {
            door.open(password);
        } else {
            System.out.println("Acceso denegado. Contrasenia incorrecta.");
        }
    }

    private boolean authenticate(String password) {
        return "$ecr@t".equals(password);
    }

    @Override
    public void close() {
        door.close();
    }
}
