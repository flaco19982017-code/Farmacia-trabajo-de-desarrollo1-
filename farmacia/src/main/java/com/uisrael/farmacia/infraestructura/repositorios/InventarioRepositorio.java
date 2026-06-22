package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmacia.infraestructura.persistencia.jpa.InventarioEntity;

public interface InventarioRepositorio extends  JpaRepository<InventarioEntity, Integer>{

}
