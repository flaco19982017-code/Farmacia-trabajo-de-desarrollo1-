package com.uisrael.farmacia.infraestructura.persistencia.jpa;
import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "detalle_pedido")
public class DetalleEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final int idDetalle;

	private final int idPedido;
	private final int idProducto;
	private final int cantidad;
	private final BigDecimal precioUnitario;
	private final BigDecimal subtotal;
}
