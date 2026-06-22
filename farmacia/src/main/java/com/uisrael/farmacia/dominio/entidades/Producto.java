package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idProducto;

	private final int idCategoria;
	private final int idLaboratorio;
	private final String nombreProducto;
	private final String descripcion;
	private final BigDecimal precio;
	private final LocalDate fechaCaducidad;
	private final boolean estado;
	public Producto(int idProducto, int idCategoria, int idLaboratorio, String nombreProducto, String descripcion,
			BigDecimal precio, LocalDate fechaCaducidad, boolean estado) {
	
		this.idProducto = idProducto;
		this.idCategoria = idCategoria;
		this.idLaboratorio = idLaboratorio;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.fechaCaducidad = fechaCaducidad;
		this.estado = estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public int getIdLaboratorio() {
		return idLaboratorio;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}
	public boolean isEstado() {
		return estado;
	}
	
}
