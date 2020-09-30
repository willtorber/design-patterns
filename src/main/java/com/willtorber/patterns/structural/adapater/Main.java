package com.willtorber.patterns.structural.adapater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	public static void main(String[] args) {
		
		IConexionSQL conexion = new AdaptadorDB( new ConexionMongoDB() );
		conexion.conexion();
		String resultado = conexion.runQuery();
		log.info(resultado);

	}

}
