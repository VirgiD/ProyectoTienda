package com.edp.proyectoTienda.web.controller;
import com.edp.proyectoTienda.domain.Purchase;
import com.edp.proyectoTienda.domain.service.PurchaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class PurchaseController {
    private PurchaseService purchaseService;

    @GetMapping("/purchase/all")
    public List<Purchase> getAll(){
        return purchaseService.getAll();
    }

}
