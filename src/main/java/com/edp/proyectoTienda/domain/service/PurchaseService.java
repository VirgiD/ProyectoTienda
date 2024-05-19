package com.edp.proyectoTienda.domain.service;


import com.edp.proyectoTienda.domain.Purchase;
import com.edp.proyectoTienda.domain.repository.PurchaseRespository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PurchaseService {

    @Autowired
    private PurchaseRespository purchaseRespository;

    public List<Purchase> getAll() {
        return purchaseRespository.getAllPurchase();
    }
}
