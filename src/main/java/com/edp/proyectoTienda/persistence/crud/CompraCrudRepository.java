package com.edp.proyectoTienda.persistence.crud;

import com.edp.proyectoTienda.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {

    List<Compra> findByMedioPago(String medioPago);


}
