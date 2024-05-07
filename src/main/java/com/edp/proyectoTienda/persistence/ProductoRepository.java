package com.edp.proyectoTienda.persistence;

import com.edp.proyectoTienda.persistence.crud.ProductoCrudRepository;
import com.edp.proyectoTienda.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();

    }

    public List<Producto>getByCategoria(int idCategoria){
        return (List<Producto>)productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    public List<Producto> stockBajo(int cantidad){
        return (List<Producto>) productoCrudRepository.findByCantidadStockLesThan(cantidad);
    }


    public void deleteProducto(int id){
        productoCrudRepository.deleteById(id);
    }
    public Producto createProducto(Producto producto){
        return productoCrudRepository.save(producto);
    }

}
