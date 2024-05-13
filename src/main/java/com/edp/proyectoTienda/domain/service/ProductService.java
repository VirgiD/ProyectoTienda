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

    public List<Product> getAll() {
        return productRepository.getAll();
    }
}