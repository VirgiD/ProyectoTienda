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
@RequestMapping("api/compra")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/purchase/all")
    public List<Purchase> getAll(){

        return purchaseService.getAll();
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
}
