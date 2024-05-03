package com.edp.proyectoTienda.persistence;

import com.edp.proyectoTienda.persistence.entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository {

    private ClienteRepository clienteRepository;

    public List<Cliente>getAll(){
        return (List<Cliente>) clienteRepository.getAll();
    }


}
