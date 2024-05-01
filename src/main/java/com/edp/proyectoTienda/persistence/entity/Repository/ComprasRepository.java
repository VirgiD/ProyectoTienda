package com.edp.proyectoTienda.persistence.entity.Repository;

import com.edp.proyectoTienda.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasRepository extends CrudRepository<Producto, Integer> {

}
