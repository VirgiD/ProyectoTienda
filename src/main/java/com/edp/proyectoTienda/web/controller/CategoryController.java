package com.edp.proyectoTienda.web.controller;

import com.edp.proyectoTienda.domain.Category;
import com.edp.proyectoTienda.domain.service.CategoryService;
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
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category/all")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @PostMapping("/add/category")
    public ResponseEntity<Category> save(@RequestBody Category category) {
        Category savedCategory = categoryService.save(category);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);  }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        boolean isDeleted = categoryService.deleteById(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }




}
