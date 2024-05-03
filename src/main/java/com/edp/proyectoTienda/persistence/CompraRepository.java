package com.edp.proyectoTienda.persistence;
import com.edp.proyectoTienda.persistence.crud.CompraCrudRepository;
import com.edp.proyectoTienda.persistence.entity.Cliente;
import com.edp.proyectoTienda.persistence.entity.Compra;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;


import java.util.List;
@NoArgsConstructor
@Repository
public class CompraRepository {

    private CompraCrudRepository compraCrudRepository;


    public List<Compra>getAll(){
        return (List<Compra>) compraCrudRepository.findAll();

    }
    public List<Cliente> getByCliente(int id){
        return compraCrudRepository.findById_cliente(id);

    }


}
