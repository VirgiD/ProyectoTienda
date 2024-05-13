package com.edp.proyectoTienda.domain.repository;


import com.edp.proyectoTienda.persistence.entity.Cliente;

import java.util.List;

public interface ClienteRepository {

    List<Cliente> getAll();
}
