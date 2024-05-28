package com.edp.proyectoTienda.persistence.Mappers;

import com.edp.proyectoTienda.domain.Customer;
import com.edp.proyectoTienda.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CustomerMapper.class})
public interface CustomerMapper {
    @Mappings({
            @Mapping(source = "idCliente", target = "customerId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "correoElectronico", target = "email")
    })
    Customer toCustomer(Cliente cliente);
    List<Customer> toCustomers(List<Cliente> clientes);


    @InheritInverseConfiguration(name = "toCustomer")
    @Mappings({
            @Mapping(target = "compras", ignore = true)
    })

    Cliente toClienteIgnoreCompras(Customer customer);

}

