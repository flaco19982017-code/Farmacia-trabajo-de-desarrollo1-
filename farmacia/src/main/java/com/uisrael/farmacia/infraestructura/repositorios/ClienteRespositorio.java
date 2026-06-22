package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.ClienteEntity;

public interface ClienteRespositorio extends  JpaRepository<ClienteEntity, Integer> {

}
