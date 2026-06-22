package com.uisrael.farmacia.dominio.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int idPedido;

	private final int idCliente;
	private final int idFarmacia;
	private final LocalDateTime fechaPedido;
	private final String estadoPedido;
	private final BigDecimal total;
	public Pedido(int idPedido, int idCliente, int idFarmacia, LocalDateTime fechaPedido, String estadoPedido,
			BigDecimal total) {
		
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.idFarmacia = idFarmacia;
		this.fechaPedido = fechaPedido;
		this.estadoPedido = estadoPedido;
		this.total = total;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public int getIdFarmacia() {
		return idFarmacia;
	}
	public LocalDateTime getFechaPedido() {
		return fechaPedido;
	}
	public String getEstadoPedido() {
		return estadoPedido;
	}
	public BigDecimal getTotal() {
		return total;
	}
	
}
