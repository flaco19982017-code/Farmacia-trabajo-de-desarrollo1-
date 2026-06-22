package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;

public class Categoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int idCategoria;
	private final String nombreCategoria;
	private final String descripcion;
	public Categoria(int idCategoria, String nombreCategoria, String descripcion) {
	
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
		this.descripcion = descripcion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
}
