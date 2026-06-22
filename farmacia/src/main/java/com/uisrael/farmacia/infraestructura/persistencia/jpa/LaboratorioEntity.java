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
@Table(name = "laboratorio")
public class LaboratorioEntity  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final int idLaboratorio;

	private final String nombreLaboratorio;
	private final String ruc;
	private final String telefono;
	private final String direccion;
}
