package com.edp.proyectoTienda.persistence.Mappers;


import com.edp.proyectoTienda.domain.PurchaseProduct;
import com.edp.proyectoTienda.domain.PurchaseProductPK;
import com.edp.proyectoTienda.persistence.entity.CompraProducto;

import com.edp.proyectoTienda.persistence.entity.CompraProductoPK;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseProductMapper {

        @Mappings({
                @Mapping(source = "id.id_compra", target = "id.purchaseId"),
                @Mapping(source = "id.idProducto", target = "id.productId"),
                @Mapping(source = "cantidad", target = "quantity"),
                @Mapping(source = "total", target = "total"),
                @Mapping(source = "estado", target = "state"),
                @Mapping(source = "producto", target = "product"),
        })
        PurchaseProduct toPurchaseProduct(CompraProducto producto);
        List<PurchaseProduct> toPurchaseProduct (List<CompraProducto> productos);

        @InheritInverseConfiguration
        CompraProducto toCompraProducto(PurchaseProduct productItem);

        default PurchaseProductPK map(CompraProductoPK value) {
                if (value != null) {
                        return new PurchaseProductPK(value.getId_compra(), value.getIdProducto());
                }
                return null;
        }

}

