package com.edp.proyectoTienda.persistence.crud;

import com.edp.proyectoTienda.domain.Product;
import com.edp.proyectoTienda.persistence.entity.Categoria;
import com.edp.proyectoTienda.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto>findByIdCategoria(int id);

    List<Producto>findByCantidadStockLessThan(int cantidad);

    List<Producto> findByIdCategoriaOrderByNombreAsc(int categoryId);


}
