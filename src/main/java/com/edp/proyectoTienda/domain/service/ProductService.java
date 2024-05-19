package com.edp.proyectoTienda.domain.service;

import com.edp.proyectoTienda.domain.Product;
import com.edp.proyectoTienda.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }
    public List<Product> findByCategory(int categoryId){
        return productRepository.findByCategory(categoryId);
    }

    public List<Product> getScareStock(int idProduct){
        return productRepository.getScarseProduct(idProduct);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }
}