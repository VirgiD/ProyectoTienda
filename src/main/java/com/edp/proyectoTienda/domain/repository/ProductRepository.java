package com.edp.proyectoTienda.domain.repository;

import com.edp.proyectoTienda.domain.Product;


import java.util.List;

public interface ProductRepository {

    List<Product> getAll();

    List<Product> getByCategory(int category);

    void createProduct(Product product);

    void deleteById(int id);

    List<Product>getScarseProduct(int productId);

    Product save (Product product);


}
