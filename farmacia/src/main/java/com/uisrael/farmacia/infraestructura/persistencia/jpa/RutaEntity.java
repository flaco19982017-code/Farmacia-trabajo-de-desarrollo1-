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
@Table(name = "ruta_distribucion")
public class RutaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final int idRuta;

	private final int idPedido;
	private final int idVehiculo;
	private final int idUsuario;
	private final LocalDateTime fechaAsignacion;
	private final String estadoRuta;
	private final String observacion;
}
