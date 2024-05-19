package com.edp.proyectoTienda.domain.repository;

import com.edp.proyectoTienda.domain.Product;


import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAllProduct();

    List<Product> findByCategory(int categoryId);

    void deleteById(int id);
   List<Product>getScarseProduct(int productId);

    Product save (Product product);


}
