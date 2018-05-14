package com.company;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    List<Pedido> pedidoList = new LinkedList<>();

    public void AddPedido(Pedido pedido)
    {
        pedidoList.add(pedido);
    }

    public void RemovePedido(int i)
    {
        pedidoList.remove(i);
    }
}
