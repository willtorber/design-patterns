package com.willtorber.patterns.creational.factory.method;

public class PizzeriaCF implements IPizzeria {

	public Pizza crearPizza(String tipo) {
		
		if (tipo.equals("Peperoni")) {
			return new Pizza( "Peperoni",8);
		}
		
		if (tipo.equals("Hawaiana")) {
			return new Pizza( "Hawaiana",8);
		}

		if (tipo.equals("Peperoni orilla rellena")) {
			return new PizzaOrillaRellena( "Peperoni", 12); //
		}
		
		return null;
	}
	
}
