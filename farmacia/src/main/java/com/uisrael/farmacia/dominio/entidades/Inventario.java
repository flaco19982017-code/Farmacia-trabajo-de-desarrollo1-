package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;

public class Inventario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idInventario;

	private final int idFarmacia;
	private final int idProducto;
	private final int stockActual;
	private final int stockMinimo;
	public Inventario(int idInventario, int idFarmacia, int idProducto, int stockActual, int stockMinimo) {
	
		this.idInventario = idInventario;
		this.idFarmacia = idFarmacia;
		this.idProducto = idProducto;
		this.stockActual = stockActual;
		this.stockMinimo = stockMinimo;
	}
	public int getIdInventario() {
		return idInventario;
	}
	public int getIdFarmacia() {
		return idFarmacia;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public int getStockActual() {
		return stockActual;
	}
	public int getStockMinimo() {
		return stockMinimo;
	}
	
}
