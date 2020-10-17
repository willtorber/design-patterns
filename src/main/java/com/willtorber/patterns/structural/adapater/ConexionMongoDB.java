package com.willtorber.patterns.structural.adapater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConexionMongoDB implements IConexionNoSQL {
	
	public void conexion() {
		log.info("Conexión con MongoDB");
	}
	
	public String excecuteSentence() {
		return "Consulta MongoDB";
	}
	
}
