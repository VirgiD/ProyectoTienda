package com.edp.proyectoTienda.persistence;

import com.edp.proyectoTienda.domain.Product;
import com.edp.proyectoTienda.domain.repository.ProductRepository;
import com.edp.proyectoTienda.persistence.Mappers.ProductMapper;
import com.edp.proyectoTienda.persistence.crud.ProductoCrudRepository;
import com.edp.proyectoTienda.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {
    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper;
    @Autowired
    public ProductoRepository(ProductoCrudRepository productoCrudRepository, ProductMapper mapper) {
        this.productoCrudRepository = productoCrudRepository;
        this.mapper = mapper;
    }


    @Override
    public List<Product> getAllProduct() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public List<Product> findByCategory(int id) {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findByIdCategoria(id);
        return mapper.toProducts(productos);
    }

    @Override
    public void deleteById(int id) {
        productoCrudRepository.deleteById(id);
    }


    @Override
    public List<Product> getScarceProduct(int productId) {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findByCantidadStockLessThan(productId);
        return mapper.toProducts(productos);
    }

    @Override
    public void deleteByIdProduct(int id) {

    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.producto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }
}
