package com.company;

import java.util.LinkedList;
import java.util.List;

public class Pedido {
    List<LineadePedido> lineadePedidoList = new LinkedList<>();
    Cliente cliente;

    public void AddLineadePedido(LineadePedido lineadePedido)
    {
        lineadePedidoList.add(lineadePedido);
    }

    public void RemoveLineadePedido(int i)
    {
        lineadePedidoList.remove(i);
    }
}
