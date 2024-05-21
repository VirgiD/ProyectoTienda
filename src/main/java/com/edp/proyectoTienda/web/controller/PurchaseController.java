package com.edp.proyectoTienda.web.controller;
import com.edp.proyectoTienda.domain.Purchase;
import com.edp.proyectoTienda.domain.service.PurchaseService;
import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/purchase/all")
    public List<Purchase> getAll(){
        return purchaseService.getAll();
    }
/*
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteByIdPurchase(@PathVariable int id) {

    }*/

    @PostMapping("/add/compra")
    public Purchase save(@RequestBody Purchase purchase){
        return purchaseService.save(purchase);
    }


}
