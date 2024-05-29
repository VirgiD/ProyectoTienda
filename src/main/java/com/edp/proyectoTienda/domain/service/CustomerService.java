package com.edp.proyectoTienda.domain.service;

import com.edp.proyectoTienda.domain.Customer;
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

    public boolean deleteByIdCustomer(int id) {  customerRepository.deleteByIdCustomer(id);

        try {
            customerRepository.deleteByIdCustomer(id);
            return true; // Devuelve true si la eliminación fue exitosa
        } catch (Exception e) {
            // cliente no encontrado)
            return false; // Devuelve false si la eliminación falló
        }
    }

    public Customer save (Customer customer){
        return customerRepository.save(customer);
    }

    public Optional<Customer> findById(int id){
         return customerRepository.findById(id);
    }


}
