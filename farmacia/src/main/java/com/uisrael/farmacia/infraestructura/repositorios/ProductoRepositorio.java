package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.ProductoEntity;

public interface ProductoRepositorio extends  JpaRepository<ProductoEntity, Integer>{

}
