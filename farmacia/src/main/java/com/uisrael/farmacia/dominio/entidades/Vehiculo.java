package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;

public class Vehiculo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idVehiculo;

	private final String placa;
	private final int capacidad;
	private final String estado;
	public Vehiculo(int idVehiculo, String placa, int capacidad, String estado) {
	
		this.idVehiculo = idVehiculo;
		this.placa = placa;
		this.capacidad = capacidad;
		this.estado = estado;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public String getEstado() {
		return estado;
	}
	
}
