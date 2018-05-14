package com.company;

public class Main {

    public static void main(String[] args) {

    Compania c1 = new Compania();

	Departamento d1 = new Departamento("Sales","Erin");
	Departamento d2 = new Departamento("R&D");
	Departamento d3 = new Departamento("US Sales", "Erin");

	InformaciondeContacto i1 = new InformaciondeContacto("1472 Miller St.");

	Persona p1 = new Persona("Erin",4362,"Vip of Sales",i1);
	p1.AddDepartamento(d1);
	p1.AddDepartamento(d3);

	c1.AddDepartamento(d1);
	c1.AddDepartamento(d2);
	c1.AddDepartamento(d3);
    }
}
