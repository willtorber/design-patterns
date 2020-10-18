package com.willtorber.patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	
	public static void main(String[] args) {
		
		IPizza pizzaPeperoni = new QuesoExtra(new PizzaPeperoni());
		
		log.info(pizzaPeperoni.descripcion());
		log.info(String.valueOf(pizzaPeperoni.precio()));

		IPizza pizzaHawaiana = new QuesoExtra(new OrillaRellena(new PizzaHawaiana()));

		log.info(pizzaHawaiana.descripcion());
		log.info(String.valueOf(pizzaHawaiana.precio()));
		
	}

}
