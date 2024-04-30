package com.edp.proyectoTienda.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter

@Table(name = "compra_producto")
public class CompraProducto {

@EmbeddedId
private CompraProductoPK id;

    private Date fecha;

    private String cliente;

    private String comentario;

    private String estado;



}
