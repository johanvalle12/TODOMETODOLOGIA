package com.company;

import java.util.LinkedList;
import java.util.List;


public class Vendedor {
    List<ClienteCorporativo> clienteCorporativoList = new LinkedList<>();


    public void AddClienteCorporativo(ClienteCorporativo clienteCorporativo)
    {
        clienteCorporativoList.add(clienteCorporativo);
    }

    public void consultaDesdeVendedor(SistemadePago s1)
    {
        s1.ConsultarSaldo();
    }
}
