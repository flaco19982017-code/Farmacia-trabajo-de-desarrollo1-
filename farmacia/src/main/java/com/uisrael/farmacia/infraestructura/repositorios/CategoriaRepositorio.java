package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.farmacia.infraestructura.persistencia.jpa.CategoriaEntity;

public interface CategoriaRepositorio extends  JpaRepository<CategoriaEntity, Integer>{

}
