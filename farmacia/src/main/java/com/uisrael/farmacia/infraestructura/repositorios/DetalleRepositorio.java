package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.DetalleEntity;

public interface DetalleRepositorio extends  JpaRepository<DetalleEntity, Integer> {

}
