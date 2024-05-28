package com.edp.proyectoTienda.persistence;

import com.edp.proyectoTienda.domain.Category;
import com.edp.proyectoTienda.domain.repository.CategoryRepository;
import com.edp.proyectoTienda.persistence.Mappers.CategoryMapper;
import com.edp.proyectoTienda.persistence.crud.CategoriaCrudRepository;
import com.edp.proyectoTienda.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CategoriaRepository implements CategoryRepository {

    private CategoriaCrudRepository categoriaCrudRepository;
    private CategoryMapper mapper;

    @Autowired
    public CategoriaRepository(CategoriaCrudRepository categoriaCrudRepository, CategoryMapper mapper) {
        this.categoriaCrudRepository = categoriaCrudRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Category> getAllCategory() {
        List<Categoria> categorias = (List<Categoria>) categoriaCrudRepository.findAll();
        return mapper.toCategory(categorias);

    }

    @Override
    public Category save(Category category) {
        Categoria categoria = mapper.categoria(category);
        return mapper.toCategory(categoriaCrudRepository.save(categoria));

    }

    @Override
    public void deleteById(int categoryId) {
    categoriaCrudRepository.deleteById(categoryId);
    }
}
