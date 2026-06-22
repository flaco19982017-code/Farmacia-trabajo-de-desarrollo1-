package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

public class Detalle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idDetalle;

	private final int idPedido;
	private final int idProducto;
	private final int cantidad;
	private final BigDecimal precioUnitario;
	private final BigDecimal subtotal;
	public Detalle(int idDetalle, int idPedido, int idProducto, int cantidad, BigDecimal precioUnitario,
			BigDecimal subtotal) {

		this.idDetalle = idDetalle;
		this.idPedido = idPedido;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subtotal = subtotal;
	}
	public int getIdDetalle() {
		return idDetalle;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	
}
