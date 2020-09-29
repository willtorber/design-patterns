package com.willtorber.patterns.creational.factory.abstract_;

public class Main {

	public static void main(String[] args) {

		SamsungStore samsung = new SamsungStore();
		AppleStore apple = new AppleStore();
		
		IComputadora mac = apple.crearComputadora();
		ITablet ipad = apple.crearTablet();
		
		IComputadora qx = samsung.crearComputadora();
		ITablet s3 = samsung.crearTablet();
		
	}

}
