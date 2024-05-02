package com.edp.proyectoTienda.persistence;

import com.edp.proyectoTienda.domain.repository.ProductoCrudRepository;
import com.edp.proyectoTienda.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();

    }
    public void deleteProducto(int id){
        productoCrudRepository.deleteById(id);
    }
}
