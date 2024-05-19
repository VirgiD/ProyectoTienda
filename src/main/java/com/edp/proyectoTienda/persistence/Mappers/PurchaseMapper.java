package com.edp.proyectoTienda.persistence.Mappers;
import com.edp.proyectoTienda.domain.Purchase;
import com.edp.proyectoTienda.domain.PurchaseProduct;
import com.edp.proyectoTienda.persistence.entity.Compra;
import com.edp.proyectoTienda.persistence.entity.CompraProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", uses = {PurchaseProductMapper.class})
public interface PurchaseMapper {
    @Mappings({
            @Mapping(source = "id_compra", target = "purchaseId"),
            @Mapping(source = "id_cliente", target = "customerId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "medioPago", target = "paymentMethod"),
            @Mapping(source = "comentario", target = "comment"),
            @Mapping(source = "productos", target = "products"),
    })
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "estado", ignore = true)

    Compra toCompra(Purchase purchase);
}
