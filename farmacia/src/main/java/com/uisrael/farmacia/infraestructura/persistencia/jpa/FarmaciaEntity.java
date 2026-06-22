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
@Table(name = "farmacia")
public class FarmaciaEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final int idFarmacia;

	private final String nombre;
	private final String direccion;
	private final String zona;
	private final boolean estado;
}
