package com.edp.proyectoTienda.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class CompraProductoPK implements Serializable {
    public CompraProductoPK(Integer id_compra, Integer idProducto) {
        this.id_compra = id_compra;
        this.idProducto = idProducto;
    }

    @Column(name = "id_compra")
    private Integer id_compra;

    @Column(name = "id_producto")
    private Integer idProducto;


    public Integer getId_compra() {
        return id_compra;
    }

    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
