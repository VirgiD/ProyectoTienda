package com.edp.proyectoTienda.persistence.Mappers;

import com.edp.proyectoTienda.domain.Category;
import com.edp.proyectoTienda.domain.Product;
import com.edp.proyectoTienda.persistence.entity.Categoria;
import com.edp.proyectoTienda.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})

public interface CategoryMapper{
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "descripcion", target = "description")

    })
    Category toCategory (Categoria categoria);
    List<Categoria> toCategory(List<Categoria>categorias);


    @InheritInverseConfiguration(name = "toCategory")
    @Mappings({
    @Mapping(target = "productos", ignore=true)
    })

    Categoria toCategoriaIgnoreProductos (Category category);

}
