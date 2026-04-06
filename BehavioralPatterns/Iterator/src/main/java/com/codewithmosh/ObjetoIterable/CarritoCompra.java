package com.codewithmosh.ObjetoIterable;

import com.codewithmosh.interfaz.Collection;
import com.codewithmosh.pojo.Producto;

import java.util.ArrayList;
import com.codewithmosh.interfaz.Iterator;
import java.util.List;

public class CarritoCompra implements Collection {

    private List<Producto> productos = new ArrayList<>();

    public void addProducto (Producto producto) {
        productos.add(producto);
    }

    @Override
    public Iterator createIterator() {
        return new CarritoCompraIterator(this);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
