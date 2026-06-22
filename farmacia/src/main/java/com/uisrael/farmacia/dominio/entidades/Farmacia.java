package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;

public class Farmacia implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idFarmacia;

	private final String nombre;
	private final String direccion;
	private final String zona;
	private final boolean estado;
	public Farmacia(int idFarmacia, String nombre, String direccion, String zona, boolean estado) {
	
		this.idFarmacia = idFarmacia;
		this.nombre = nombre;
		this.direccion = direccion;
		this.zona = zona;
		this.estado = estado;
	}
	public int getIdFarmacia() {
		return idFarmacia;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getZona() {
		return zona;
	}
	public boolean isEstado() {
		return estado;
	}
	
}
