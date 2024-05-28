package com.edp.proyectoTienda.domain.repository;


import com.edp.proyectoTienda.domain.Category;

import java.util.List;

public interface CategoryRepository {


    List<Category> getAllCategory();
    Category save(Category category);
    void deleteById(int categoryId);





}
