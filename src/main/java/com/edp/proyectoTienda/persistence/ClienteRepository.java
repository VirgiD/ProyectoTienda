package com.edp.proyectoTienda.persistence;

import com.edp.proyectoTienda.domain.Customer;
import com.edp.proyectoTienda.domain.repository.CustomerRepository;
import com.edp.proyectoTienda.persistence.Mappers.CustomerMapper;
import com.edp.proyectoTienda.persistence.crud.ClienteCrudRepository;
import com.edp.proyectoTienda.persistence.entity.Cliente;
import com.edp.proyectoTienda.persistence.entity.Compra;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository implements CustomerRepository {

    private ClienteCrudRepository clienteCrudRepository;
    private CustomerMapper mapper;


    @Override
    public List<Customer> getAllCustomer() {
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return mapper.toCustomers(clientes);
    }
}
