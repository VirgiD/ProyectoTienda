package com.edp.proyectoTienda.persistence;
import com.edp.proyectoTienda.persistence.crud.CompraCrudRepository;
import com.edp.proyectoTienda.persistence.entity.Cliente;
import com.edp.proyectoTienda.persistence.entity.Compra;


import java.util.List;

public class CompraRepository {

    private CompraCrudRepository compraCrudRepository;

    public CompraRepository(CompraCrudRepository compraCrudRepository) {
        this.compraCrudRepository = compraCrudRepository;
    }

    public List<Compra>getAll(){
        return (List<Compra>) compraCrudRepository.findAll();

    }
    public List<Cliente> getByCliente(int id){
        return compraCrudRepository.findByCliente(id);

    }


}
