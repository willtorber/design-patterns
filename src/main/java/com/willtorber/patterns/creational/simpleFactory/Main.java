package com.willtorber.patterns.creational.simpleFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	
	public static void main(String[] args) {
		
		Pizzeria pizzeriaCF = new Pizzeria();
		Pizza pizzaPeperoni = pizzeriaCF.crearPizzaChica();
		log.info(pizzaPeperoni.toString());

	}
	
}
