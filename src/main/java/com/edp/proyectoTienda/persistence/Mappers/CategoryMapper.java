package com.edp.proyectoTienda.persistence.Mappers;

import com.edp.proyectoTienda.domain.Category;
import com.edp.proyectoTienda.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "sprint")

public interface CategoryMapper  {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoriId"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "descripcion", target = "description")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
