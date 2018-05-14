package com.company;

public class Departamento {
    String name;
    String manager;

    public Departamento(String name, String manager) {
        this.name = name;
        this.manager = manager;
    }

    public Departamento(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
