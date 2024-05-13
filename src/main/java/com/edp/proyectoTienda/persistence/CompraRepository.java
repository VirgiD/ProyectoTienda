package com.edp.proyectoTienda.persistence;
import com.edp.proyectoTienda.persistence.Mappers.CompraMapper;
import com.edp.proyectoTienda.persistence.crud.CompraCrudRepository;
import com.edp.proyectoTienda.persistence.entity.Cliente;
import com.edp.proyectoTienda.persistence.entity.Compra;
import com.edp.proyectoTienda.persistence.entity.CompraProducto;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@Repository
public class CompraRepository implements CompraCrudRepository{

    private CompraCrudRepository compraCrudRepository;
    private CompraMapper mapper;




    public List<Cliente> getByCliente(int id){
        return compraCrudRepository.findById_cliente(id);

    }


    @Override
    public List<CompraProducto> findByProductos(int id) {
        return null;
    }

    @Override
    public List<Cliente> findById_cliente(int id) {
        return null;
    }

    @Override
    public <S extends Compra> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Compra> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Compra> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Compra> findAll() {
        return null;
    }

    @Override
    public Iterable<Compra> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Compra entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Compra> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
