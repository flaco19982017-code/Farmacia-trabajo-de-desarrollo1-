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
@Table(name = "cliente")
public class ClienteEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final int idCliente;

	private final String nombres;
	private final String identificacion;
	private final String telefono;
	private final String correo;
	private final String direccion;
	private final String tipoCliente;
	private final String clasificacion;
}
