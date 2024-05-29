package com.edp.proyectoTienda.domain.repository;

import com.edp.proyectoTienda.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface ProductRepository {

    List<Product> getAllProduct();

    List<Product> findByCategory(int categoryId);

    void deleteById(int id);
   List<Product>getScarceProduct(int productId);

   void deleteByIdProduct(int id);

    Product save (Product product);


}
