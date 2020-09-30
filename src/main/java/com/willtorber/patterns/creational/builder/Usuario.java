package com.willtorber.patterns.creational.builder;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private boolean medioContacto; // Opcional
	/**
	 * Dependen de 'medioContacto'
	 * */
	private String email;
	private String telefono;
	private String direccion;
	/**
	 * Dependen de los atributos anteriores
	 * */
	private String metodoPago;

	public BuilderUsuario setMedioContacto(boolean medioContacto) {
		if(!medioContacto) {
			throw new IllegalArgumentException("No es posible asiganar un valor falso a medio de contacto");
		}
		this.medioContacto = medioContacto;
		return new BuilderUsuario(this);
	}
	
	private Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.medioContacto = false;
		this.email = "";
		this.telefono = "";
		this.direccion = "";
	}
	
	public static Usuario make(String nombre, String apellido) {
		return new Usuario(nombre, apellido);
	}
	
	public Usuario Build() {
		return this;
	}
	
	public String toString() {
		return " " + this.nombre + " " + this.apellido + " " + this.email + " " + this.telefono + " " + this.direccion;
	}
	
	
	public static class BuilderUsuario{
		
		private Usuario usuario;
		
		public BuilderUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
		public BuilderUsuario setDireccion(String direccion) {
			usuario.direccion = direccion;
			return this;
		}

		public BuilderUsuario setEmail(String email) {
			usuario.email = email;
			return this;
		}

		public BuilderUsuario setTelefono(String telefono) {
			usuario.telefono = telefono;
			return this;
		}

		public BuilderUsuario setMetodoPago(String metodoPago) {
			if(usuario.email.equals("") || usuario.direccion.equals("") || usuario.telefono.equals("")){
				throw new IllegalArgumentException("No es posible asignar un método de pago");
			}
			usuario.metodoPago = metodoPago;
			return this;
		}
		
		public Usuario build() {
			return usuario;
		}
	}
	
}
