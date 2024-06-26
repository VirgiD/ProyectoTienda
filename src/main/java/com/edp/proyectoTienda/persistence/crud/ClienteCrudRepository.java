package com.edp.proyectoTienda.persistence.crud;
import com.edp.proyectoTienda.domain.Customer;
import com.edp.proyectoTienda.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {

        List<Cliente> findByApellidoAndNombre(String apellido, String nombre);

}
