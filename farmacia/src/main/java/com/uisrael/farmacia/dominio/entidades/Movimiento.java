package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Movimiento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idMovimiento;

	private final int idInventario;
	private final int idUsuario;
	private final String tipoMovimiento;
	private final int cantidad;
	private final LocalDateTime fechaMovimiento;
	private final String observacion;
	public Movimiento(int idMovimiento, int idInventario, int idUsuario, String tipoMovimiento, int cantidad,
			LocalDateTime fechaMovimiento, String observacion) {
	
		this.idMovimiento = idMovimiento;
		this.idInventario = idInventario;
		this.idUsuario = idUsuario;
		this.tipoMovimiento = tipoMovimiento;
		this.cantidad = cantidad;
		this.fechaMovimiento = fechaMovimiento;
		this.observacion = observacion;
	}
	public int getIdMovimiento() {
		return idMovimiento;
	}
	public int getIdInventario() {
		return idInventario;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public String getTipoMovimiento() {
		return tipoMovimiento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public LocalDateTime getFechaMovimiento() {
		return fechaMovimiento;
	}
	public String getObservacion() {
		return observacion;
	}
	
}
