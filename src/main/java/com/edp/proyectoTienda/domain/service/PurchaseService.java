package com.edp.proyectoTienda.domain.service;



import com.edp.proyectoTienda.domain.Purchase;
import com.edp.proyectoTienda.domain.repository.PurchaseRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PurchaseService {

    @Autowired
    private PurchaseRespository purchaseRespository;

    public List<Purchase> getAll() {
        return purchaseRespository.getAll();
    }
    public Purchase save(Purchase purchase) {
        return purchaseRespository.save(purchase);
    }

    public void deleteById(int id) {
        purchaseRespository.deleteByIdPurchase(id);
    }
   public List<Purchase> findByMedioPago(String paymentMethod){
        return purchaseRespository.findByMedioPago(paymentMethod);
    }

}
