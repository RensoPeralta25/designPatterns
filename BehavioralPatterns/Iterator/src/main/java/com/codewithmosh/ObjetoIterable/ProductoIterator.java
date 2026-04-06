package com.codewithmosh.ObjetoIterable;

import pojo.Producto;

import java.util.Iterator;

public class ProductoIterator implements Iterator {
    private CarritoCompra carritoCompra;
    private int index;

    public ProductoIterator (CarritoCompra carritoCompra, int index){
        this.carritoCompra = carritoCompra;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < carritoCompra.getProductos().size();
    }

    @Override
    public Producto next() {
        if (hasNext()) {
            return carritoCompra.getProductos().get(index++);
        }
        return null;
    }
}
