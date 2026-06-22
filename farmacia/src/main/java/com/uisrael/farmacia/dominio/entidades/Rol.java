package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;

public class Rol implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idRol;

	private final String nombreRol;
	private final String descripcion;
	public Rol(int idRol, String nombreRol, String descripcion) {
		
		this.idRol = idRol;
		this.nombreRol = nombreRol;
		this.descripcion = descripcion;
	}
	public int getIdRol() {
		return idRol;
	}
	public String getNombreRol() {
		return nombreRol;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
}
