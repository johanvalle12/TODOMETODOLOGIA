package com.company;

import java.util.LinkedList;
import java.util.List;

public class LineadePedido {
    List<Producto> productoList = new LinkedList<>();
    Pedido pedido;

    public void AddProducto(Producto producto)
    {
        productoList.add(producto);
    }

    public void RemoveProducto(int i)
    {
        productoList.remove(i);
    }
}
