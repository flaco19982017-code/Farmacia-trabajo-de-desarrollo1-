package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.FarmaciaEntity;

public interface FarmaciaRepositorio extends  JpaRepository<FarmaciaEntity, Integer>{

}
