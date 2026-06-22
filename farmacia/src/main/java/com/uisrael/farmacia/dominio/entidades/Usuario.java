package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;

public class Usuario  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idUsuario;

	private final int idRol;
	private final String nombre;
	private final String correo;
	private final String clave;
	private final boolean estado;
	public Usuario(int idUsuario, int idRol, String nombre, String correo, String clave, boolean estado) {
	
		this.idUsuario = idUsuario;
		this.idRol = idRol;
		this.nombre = nombre;
		this.correo = correo;
		this.clave = clave;
		this.estado = estado;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public int getIdRol() {
		return idRol;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public String getClave() {
		return clave;
	}
	public boolean isEstado() {
		return estado;
	}
	
}
