package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.MovimientoEntity;

public interface MovimientoRepositorio extends  JpaRepository<MovimientoEntity, Integer> {

}
