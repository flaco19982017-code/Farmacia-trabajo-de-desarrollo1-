package com.uisrael.farmacia.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.farmacia.infraestructura.persistencia.jpa.PedidoEntity;

public interface PedidoRepositorio extends  JpaRepository<PedidoEntity, Integer>{

}
