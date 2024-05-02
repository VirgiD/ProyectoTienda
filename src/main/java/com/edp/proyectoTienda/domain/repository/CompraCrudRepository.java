package com.edp.proyectoTienda.domain.repository;

import com.edp.proyectoTienda.persistence.entity.Cliente;
import com.edp.proyectoTienda.persistence.entity.Compra;
import com.edp.proyectoTienda.persistence.entity.CompraProducto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {

    List<CompraProducto>findByProductos(int id);

    List<Cliente>findByCliente(int id);


}
