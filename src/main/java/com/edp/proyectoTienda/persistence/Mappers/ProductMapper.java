package com.edp.proyectoTienda.persistence.Mappers;

import com.edp.proyectoTienda.domain.Product;
import com.edp.proyectoTienda.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "categoria", target = "category"),
            @Mapping(source = "precioDeVenta", target = "price"),
            @Mapping(source = "estado", target = "state")
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto>productos);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "codigoBarra", ignore = true),
            @Mapping(target = "cantidadStock", ignore = true)
    })
    Producto producto(Product product);
}