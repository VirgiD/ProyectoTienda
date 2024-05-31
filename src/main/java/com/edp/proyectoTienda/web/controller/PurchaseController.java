package com.edp.proyectoTienda.web.controller;
import com.edp.proyectoTienda.domain.Purchase;
import com.edp.proyectoTienda.domain.service.PurchaseService;
import com.edp.proyectoTienda.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/compra")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/purchase/all")
    public ResponseEntity<List<Purchase>> getAll() {
        List<Purchase> purchases = purchaseService.getAll();
        if (purchases.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(purchases);
        }
    }


@PostMapping("/add/compra")
    public Purchase save(@RequestBody Purchase purchase){
        return purchaseService.save(purchase);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        purchaseService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/byPaymentMethod")
    public ResponseEntity<List<Purchase>> getByMedioPago(@RequestParam String paymentMethod) {
        List<Purchase> purchases = purchaseService.findByMedioPago(paymentMethod);
        if (purchases.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(purchases);
        }
    }
}

