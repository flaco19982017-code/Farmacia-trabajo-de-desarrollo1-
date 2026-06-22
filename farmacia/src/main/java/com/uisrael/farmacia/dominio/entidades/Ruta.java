package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Ruta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idRuta;

	private final int idPedido;
	private final int idVehiculo;
	private final int idUsuario;
	private final LocalDateTime fechaAsignacion;
	private final String estadoRuta;
	private final String observacion;
	public Ruta(int idRuta, int idPedido, int idVehiculo, int idUsuario, LocalDateTime fechaAsignacion,
			String estadoRuta, String observacion) {
	
		this.idRuta = idRuta;
		this.idPedido = idPedido;
		this.idVehiculo = idVehiculo;
		this.idUsuario = idUsuario;
		this.fechaAsignacion = fechaAsignacion;
		this.estadoRuta = estadoRuta;
		this.observacion = observacion;
	}
	public int getIdRuta() {
		return idRuta;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public LocalDateTime getFechaAsignacion() {
		return fechaAsignacion;
	}
	public String getEstadoRuta() {
		return estadoRuta;
	}
	public String getObservacion() {
		return observacion;
	}
	
}
