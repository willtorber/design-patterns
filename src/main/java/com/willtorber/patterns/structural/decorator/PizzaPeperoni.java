package com.willtorber.patterns.structural.decorator;

public class PizzaPeperoni implements IPizza {
	
	public String descripcion() {
		return "Pizza de peperoni";
	}
	
	public float precio() {
		return 8;
	}
}
