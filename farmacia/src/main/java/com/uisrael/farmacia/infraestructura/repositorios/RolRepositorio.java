package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.RolEntity;

public interface RolRepositorio extends  JpaRepository<RolEntity, Integer> {

}
