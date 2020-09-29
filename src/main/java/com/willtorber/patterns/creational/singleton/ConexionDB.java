package com.willtorber.patterns.creational.singleton;

public class ConexionDB {

	private static ConexionDB conexion;

	private ConexionDB() { }
	
	public static synchronized ConexionDB obtenerConexion() {
		if(conexion == null) { 
			conexion = new ConexionDB();
		}
		return conexion;
	}
	
}
