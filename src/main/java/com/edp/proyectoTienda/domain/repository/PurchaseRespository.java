package com.edp.proyectoTienda.domain.repository;

import com.edp.proyectoTienda.domain.Purchase;

import java.util.List;

public interface PurchaseRespository {
    List<Purchase> getAllPurchase();
    Purchase save(Purchase purchase);


    Purchase deleteByIdPurchase(int id);

    List<Purchase> findByPaymentsMethod(String paymentMethod);
}
