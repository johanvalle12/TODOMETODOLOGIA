package com.company;

import java.util.LinkedList;
import java.util.List;

public class Producto {
    List<LineadePedido> lineadePedidoList = new LinkedList<>();

    public void AddLineadePedido(LineadePedido lineadePedido)
    {
        lineadePedidoList.add(lineadePedido);
    }

    public void RemoveLineadePedido(int i)
    {
        lineadePedidoList.remove(i);
    }
}
