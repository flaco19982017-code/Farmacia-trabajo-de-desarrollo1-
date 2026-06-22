package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.LaboratorioEntity;

public interface LaboratorioRepositorio extends  JpaRepository<LaboratorioEntity, Integer> {

}
