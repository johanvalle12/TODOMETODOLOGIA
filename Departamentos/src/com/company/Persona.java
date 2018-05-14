package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Persona {
    String name;
    int employeeID;
    String title;
    InformaciondeContacto informaciondeContacto;
    List<Departamento> departamentoList;

    public Persona(String name, int employeeID, String title, InformaciondeContacto informaciondeContacto) {
        this.name = name;
        this.employeeID = employeeID;
        this.title = title;
        this.informaciondeContacto = informaciondeContacto;
        this.departamentoList = new LinkedList<Departamento>();
    }

    public Persona(String name, int employeeID, String title, InformaciondeContacto informaciondeContacto, List<Departamento> departamentoList) {

        this.name = name;
        this.employeeID = employeeID;
        this.title = title;
        this.informaciondeContacto = informaciondeContacto;
        this.departamentoList = departamentoList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public InformaciondeContacto getInformaciondeContacto() {
        return informaciondeContacto;
    }

    public void setInformaciondeContacto(InformaciondeContacto informaciondeContacto) {
        this.informaciondeContacto = informaciondeContacto;
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
