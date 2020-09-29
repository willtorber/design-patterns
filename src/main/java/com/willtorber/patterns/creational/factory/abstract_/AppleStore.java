package com.willtorber.patterns.creational.factory.abstract_;

public class AppleStore implements IAbstractFactory {

	public IComputadora crearComputadora() {
		return new MacbookPro();
	}
	
	public ITablet crearTablet() {
		return new IPad();
	}
	
}
