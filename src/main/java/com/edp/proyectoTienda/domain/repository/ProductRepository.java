package com.edp.proyectoTienda.domain.repository;

import com.edp.proyectoTienda.domain.Product;


import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();

    Optional<List<Product>> getByCategory(int category);

    void createProduct(Product product);

    void deleteById(int id);

    List<Product>getScarseProduct(int quantity);

    Product save (Product product);


}
