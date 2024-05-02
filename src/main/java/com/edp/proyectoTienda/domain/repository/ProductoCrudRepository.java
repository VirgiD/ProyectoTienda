package com.edp.proyectoTienda.domain.repository;

import com.edp.proyectoTienda.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto>findByCategoria(int id);

    List<Producto>findByCantidadStockLesThan(int cantidad);
}
