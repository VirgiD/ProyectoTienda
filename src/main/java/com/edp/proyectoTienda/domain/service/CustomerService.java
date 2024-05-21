package com.edp.proyectoTienda.domain.service;

import com.edp.proyectoTienda.domain.Customer;
import com.edp.proyectoTienda.domain.repository.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

     public List<Customer> getAll(){
         return customerRepository.getAllCustomer();
     }

    public void deleteCustomer(int id) {
        customerRepository.deleteByIdCustomer(id);
    }
    public Customer getCustomerById(int id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()) {
            return customerOptional.get();
        } else {
            throw new EntityNotFoundException("Cliente con id " + id + " no encontrado.");
        }
    }
}
