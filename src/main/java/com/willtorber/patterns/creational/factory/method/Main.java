package com.willtorber.patterns.creational.factory.method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	public static void main(String[] args) {
		
		PizzeriaCF cf = new PizzeriaCF();
		
		Pizza peperoni = cf.crearPizza("Peperoni");
		Pizza hawaiana = cf.crearPizza("Hawaiana");
		Pizza orillaRellena = cf.crearPizza("Peperoni orilla rellena");

		log.info(peperoni.toString());
		log.info(hawaiana.toString());
		log.info(orillaRellena.toString());
		
	}

}
