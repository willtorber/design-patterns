package com.willtorber.patterns.structural.adapater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConexionMySQL implements IConexionSQL {

	public void conexion() {
		log.info("Conexión con MYSQL");
	}
	
	public String runQuery() {
		return "Consulta MYSQL";
	}
	
}
