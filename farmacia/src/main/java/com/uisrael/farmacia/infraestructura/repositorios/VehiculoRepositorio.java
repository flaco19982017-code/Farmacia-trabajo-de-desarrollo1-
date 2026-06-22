package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.VehiculoEntity;

public interface VehiculoRepositorio extends  JpaRepository<VehiculoEntity, Integer> {

}
