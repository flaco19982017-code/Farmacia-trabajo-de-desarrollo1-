package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.UsuarioEntity;

public interface UsuarioRepositorio extends  JpaRepository<UsuarioEntity, Integer>{

}
