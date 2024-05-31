package com.edp.proyectoTienda.web.controller;

import com.edp.proyectoTienda.domain.Product;
import com.edp.proyectoTienda.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductController {
@Autowired
    private ProductService productService ;
    @GetMapping("/product/all")
    public List<Product> getAll(){
return productService.getAllProduct();
}

    @GetMapping("/category/{id}")
    public ResponseEntity<List<Product>> findByCategory(@PathVariable("id") int categoryId){
        return new ResponseEntity<>(productService.findByCategory(categoryId), HttpStatus.CREATED);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<List<Product>> getScarceProduct(@PathVariable("id") int idProduct){
        List<Product> products =  productService.getScarceStock(idProduct);
        if(products.size() > 0){
            return new ResponseEntity<>(products,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping("/add/product")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        Product savedProduct = productService.save(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") int idProduct) {
    boolean isDeleted = productService.deleteByIdProduct(idProduct);
    if (isDeleted) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
}
