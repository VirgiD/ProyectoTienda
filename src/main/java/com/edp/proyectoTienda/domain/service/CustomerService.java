package com.edp.proyectoTienda.domain.service;

import com.edp.proyectoTienda.domain.Customer;
import com.edp.proyectoTienda.domain.Purchase;
import com.edp.proyectoTienda.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

     public List<Customer> getAll(){
         return customerRepository.getAllCustomer();
     }

    public void deleteCustomer(int id) {
        customerRepository.deleteByIdCustomer(id);
    }

    public Customer save (Customer customer){
        return customerRepository.save(customer);
    }

    public Optional<Customer> findById(int id){
         return customerRepository.findById(id);
    }


}
