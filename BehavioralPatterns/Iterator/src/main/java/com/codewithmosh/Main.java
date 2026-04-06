package com.codewithmosh;

import com.codewithmosh.ObjetoIterable.CarritoCompra;
import com.codewithmosh.pojo.Producto;

import com.codewithmosh.interfaz.Iterator;

public class Main {
    public static void main(String args[]) {
        CarritoCompra carritoCompra = new CarritoCompra();

        Producto producto1 = new Producto(1L, "cereal", 250);
        Producto producto2 = new Producto(2L, "leche", 80);
        Producto producto3 = new Producto(3L, "yogurt", 150);

        carritoCompra.addProducto(producto1);
        carritoCompra.addProducto(producto2);
        carritoCompra.addProducto(producto3);

        Iterator iterator = carritoCompra.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getNombreProducto());
        }

    }
}
