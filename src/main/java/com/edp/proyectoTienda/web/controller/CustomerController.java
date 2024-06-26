package com.edp.proyectoTienda.web.controller;


import com.edp.proyectoTienda.Exception.CustomerNotFoundException;
import com.edp.proyectoTienda.domain.Customer;
import com.edp.proyectoTienda.domain.service.CustomerService;
import com.edp.proyectoTienda.persistence.entity.Cliente;
import com.mysql.cj.x.protobuf.Mysqlx;
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
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class CustomerController {

   @Autowired
   private CustomerService customerService;

   @GetMapping("customer/all")
   public ResponseEntity<List<Customer>> getAllCustomer() {
      List<Customer> customers = customerService.getAll();
      if (customers.isEmpty()) {
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(customers, HttpStatus.OK);
   }

   @GetMapping("customer/{id}")
   public ResponseEntity<Customer> findById(@PathVariable int id) {
      Optional<Customer> customer = customerService.findById(id);
      if (customer.isPresent()) {
         return new ResponseEntity<>(customer.get(), HttpStatus.OK);
      } else {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
   }

   @PostMapping("customer")
   public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
      Customer savedCustomer = customerService.save(customer);
      return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
   }
   @GetMapping("/buscar/{apellido}/{nombre}")
   public ResponseEntity<?> findByApellidoAndNombre(@PathVariable("apellido") String apellido, @PathVariable("nombre") String nombre) {
      try {
         Customer customer = (Customer) customerService.findByApellidoAndNombre(apellido, nombre);
         return ResponseEntity.ok(customer);
      } catch (CustomerNotFoundException e) {
         return ResponseEntity.notFound().build();
      } catch (Exception e) {
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
      }
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteByIdCustomer(@PathVariable int id) {
      boolean isDeleted = customerService.deleteByIdCustomer(id);
      if (isDeleted) {
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      } else {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
   }

}
