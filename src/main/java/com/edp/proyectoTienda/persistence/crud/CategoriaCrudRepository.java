package com.edp.proyectoTienda.persistence.crud;


import com.edp.proyectoTienda.domain.Category;
import com.edp.proyectoTienda.persistence.entity.Categoria;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {



}

