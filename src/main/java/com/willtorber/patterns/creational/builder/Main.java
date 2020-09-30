package com.willtorber.patterns.creational.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usuario = Usuario.make("Codi", "Facilito")
							.setMedioContacto(false)
							.setDireccion("México")
							.setMetodoPago("Credito").build();
							
		log.info(usuario.toString());
	}

}
