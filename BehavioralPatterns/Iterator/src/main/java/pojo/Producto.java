package pojo;

public class Producto {
    private Long id;
    private String nombreProducto;
    private double precio;

    public Producto (Long id, String nombreProducto, double precio) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public Long getId () {
        return id;
    }

    public String getNombreProducto () {
        return nombreProducto;
    }

    public double getPrecio () {
        return precio;
    }

}
