package com.edp.proyectoTienda.domain.repository;


import com.edp.proyectoTienda.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    List<Customer> getAllCustomer();
    void deleteByIdCustomer(int id);
    Customer getCustomerById(int id);
    Customer save (Customer customer);
    Optional<Customer> findById(int id);
}
