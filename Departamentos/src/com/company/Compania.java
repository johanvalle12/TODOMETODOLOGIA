package com.company;

import java.util.LinkedList;
import java.util.List;

public class Compania {
    List<Departamento> departamentoList;

    public Compania() {
        this.departamentoList = new LinkedList<Departamento>();
    }

    public void AddDepartamento(Departamento departamento)
    {
        departamentoList.add(departamento);
    }
    public void RemoveDepartamento(int i)
    {
        departamentoList.remove(i);
    }
}
