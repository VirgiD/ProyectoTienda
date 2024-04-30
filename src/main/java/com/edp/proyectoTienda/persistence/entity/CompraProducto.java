package com.edp.proyectoTienda.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="compra_producto")
public class CompraProducto {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_compra")
    private Integer idCompra;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente clientes;

    private Date fecha;

    private String cliente;

    private String comentario;

    private String estado;





}
