package com.uisrael.farmacia.infraestructura.persistencia.jpa;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "inventario")
public class InventarioEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final int idInventario;

	private final int idFarmacia;
	private final int idProducto;
	private final int stockActual;
	private final int stockMinimo;

}
