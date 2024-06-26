package com.edp.proyectoTienda.persistence;

import com.edp.proyectoTienda.domain.Customer;
import com.edp.proyectoTienda.domain.repository.CustomerRepository;
import com.edp.proyectoTienda.persistence.Mappers.CustomerMapper;
import com.edp.proyectoTienda.persistence.crud.ClienteCrudRepository;
import com.edp.proyectoTienda.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements CustomerRepository {

    private ClienteCrudRepository clienteCrudRepository;
    private CustomerMapper mapper;
    @Autowired
    public ClienteRepository(ClienteCrudRepository clienteCrudRepository, CustomerMapper mapper) {
        this.clienteCrudRepository = clienteCrudRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return mapper.toCustomers(clientes);
    }

    @Override
    public void deleteByIdCustomer(int id) {
        clienteCrudRepository.deleteById(id);
    }



    @Override
    public Customer save(Customer customer) {
        Cliente cliente = mapper.toClienteIgnoreCompras(customer);
        return mapper.toCustomer(clienteCrudRepository.save(cliente));
    }

    @Override
    public Optional<Customer> findById(int id) {
        Optional<Cliente> clienteOptional = clienteCrudRepository.findById(id);
        return clienteOptional.map(mapper::toCustomer);
    }


    @Override
    public List<Customer> findByApellidoAndNombre(String apellido, String nombre) {
        List<Cliente> clientes = clienteCrudRepository.findByApellidoAndNombre(apellido, nombre);
        return mapper.toCustomers(clientes);
    }


}
