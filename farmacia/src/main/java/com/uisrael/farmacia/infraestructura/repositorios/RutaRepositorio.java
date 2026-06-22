package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.RutaEntity;

public interface RutaRepositorio extends  JpaRepository<RutaEntity, Integer> {

}
