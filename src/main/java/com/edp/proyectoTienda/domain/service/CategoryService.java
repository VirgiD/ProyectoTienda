package com.edp.proyectoTienda.domain.service;


import com.edp.proyectoTienda.domain.Category;
import com.edp.proyectoTienda.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategory() {
        return categoryRepository.getAllCategory();
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public boolean deleteById(int categoryId){
        categoryRepository.deleteById(categoryId);
        return false;
    }

}