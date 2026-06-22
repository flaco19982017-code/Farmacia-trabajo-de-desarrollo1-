package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;

public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int idCliente;

	private final String nombres;
	private final String identificacion;
	private final String telefono;
	private final String correo;
	private final String direccion;
	private final String tipoCliente;
	private final String clasificacion;
	
	public Cliente(int idCliente, String nombres, String identificacion, String telefono, String correo,
			String direccion, String tipoCliente, String clasificacion) {
		super();
		this.idCliente = idCliente;
		this.nombres = nombres;
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.tipoCliente = tipoCliente;
		this.clasificacion = clasificacion;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public String getNombres() {
		return nombres;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	
	

}
