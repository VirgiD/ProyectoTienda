package com.edp.proyectoTienda.persistence.Mappers;

import com.edp.proyectoTienda.domain.Category;
import com.edp.proyectoTienda.domain.Customer;
import com.edp.proyectoTienda.persistence.entity.Categoria;
import com.edp.proyectoTienda.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring", uses = {CategoryMapper.class})

public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria",target = "categoryId"),
            @Mapping(source = "descripcion",target = "description"),
            @Mapping(source = "estado",target = "state")
    })
    Category toCategory(Categoria categoria);
    List<Category> toCategory(List<Categoria> categorias);
    @InheritInverseConfiguration(name = "toCategory")
    @Mappings({
            @Mapping(target = "productos", ignore = true)
    })

    Categoria categoria (Category category);



}
