package com.edp.proyectoTienda.web.controller;

import com.edp.proyectoTienda.domain.Category;
import com.edp.proyectoTienda.domain.Customer;
import com.edp.proyectoTienda.domain.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class CustomerController {

   @Autowired
   private CustomerService customerService;

   @GetMapping("customer/all")
   public List<Customer> getAll(){
      return customerService.getAll();
   }



}
