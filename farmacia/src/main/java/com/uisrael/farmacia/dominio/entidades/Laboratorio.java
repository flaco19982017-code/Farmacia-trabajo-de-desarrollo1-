package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;

public class Laboratorio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idLaboratorio;

	private final String nombreLaboratorio;
	private final String ruc;
	private final String telefono;
	private final String direccion;
	public Laboratorio(int idLaboratorio, String nombreLaboratorio, String ruc, String telefono, String direccion) {
		
		this.idLaboratorio = idLaboratorio;
		this.nombreLaboratorio = nombreLaboratorio;
		this.ruc = ruc;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public int getIdLaboratorio() {
		return idLaboratorio;
	}
	public String getNombreLaboratorio() {
		return nombreLaboratorio;
	}
	public String getRuc() {
		return ruc;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	
}
