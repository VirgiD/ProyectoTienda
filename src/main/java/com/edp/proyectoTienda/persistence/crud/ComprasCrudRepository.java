package com.edp.proyectoTienda.persistence.crud;

import com.edp.proyectoTienda.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasCrudRepository extends CrudRepository<Producto, Integer> {

}
