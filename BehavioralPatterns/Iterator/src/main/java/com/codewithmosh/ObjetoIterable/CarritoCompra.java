package com.codewithmosh.ObjetoIterable;

import com.codewithmosh.interfaz.Collection;
import pojo.Producto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarritoCompra implements Collection {

    private List<Producto> productos = new ArrayList<>();

    public void addProducto (Producto producto) {
        productos.add(producto);
    }

    @Override
    public Iterator createIterator() {
        return null;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
