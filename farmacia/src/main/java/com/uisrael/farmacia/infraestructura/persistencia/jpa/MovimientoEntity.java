package com.uisrael.farmacia.infraestructura.persistencia.jpa;
import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "movimiento_inventario")
public class MovimientoEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final int idMovimiento;

	private final int idInventario;
	private final int idUsuario;
	private final String tipoMovimiento;
	private final int cantidad;
	private final LocalDateTime fechaMovimiento;
	private final String observacion;
}
