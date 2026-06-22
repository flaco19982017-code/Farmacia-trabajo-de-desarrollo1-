package com.uisrael.farmacia.infraestructura.persistencia.jpa;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class ProductoEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final int idProducto;

	private final int idCategoria;
	private final int idLaboratorio;
	private final String nombreProducto;
	private final String descripcion;
	private final BigDecimal precio;
	private final LocalDate fechaCaducidad;
	private final boolean estado;
}
