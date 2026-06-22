package com.uisrael.farmacia.infraestructura.persistencia.jpa;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pedido")
public class PedidoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final int idPedido;

	private final int idCliente;
	private final int idFarmacia;
	private final LocalDateTime fechaPedido;
	private final String estadoPedido;
	private final BigDecimal total;
}
