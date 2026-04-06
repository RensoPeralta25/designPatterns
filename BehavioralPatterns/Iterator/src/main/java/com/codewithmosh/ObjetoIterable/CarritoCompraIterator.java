package com.codewithmosh.ObjetoIterable;

import com.codewithmosh.pojo.Producto;

import com.codewithmosh.interfaz.Iterator;

public class CarritoCompraIterator implements Iterator {
    private CarritoCompra carritoCompra;
    private int index;

    public CarritoCompraIterator (CarritoCompra carritoCompra){
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
