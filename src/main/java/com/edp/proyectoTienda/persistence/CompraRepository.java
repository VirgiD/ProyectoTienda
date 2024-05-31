package com.edp.proyectoTienda.persistence;

import com.edp.proyectoTienda.domain.Purchase;
import com.edp.proyectoTienda.domain.repository.PurchaseRespository;
import com.edp.proyectoTienda.persistence.Mappers.PurchaseMapper;
import com.edp.proyectoTienda.persistence.crud.CompraCrudRepository;
import com.edp.proyectoTienda.persistence.entity.Compra;
import com.edp.proyectoTienda.persistence.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public class CompraRepository implements PurchaseRespository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Autowired
    private PurchaseMapper mapper;


    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }

    @Override
    public void deleteByIdPurchase(int id) {
        compraCrudRepository.deleteById(id);

    }

    @Override
    public List<Purchase> findByMedioPago(String paymentMethod) {
        List<Compra> compras = compraCrudRepository.findByMedioPago(paymentMethod);
        return mapper.toPurchases(compras);

    }
}