package com.edp.proyectoTienda.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_compra;

    @Column(name="id_cliente")
    private Integer id_cliente;

    private LocalDateTime fecha;

    private String medioPago;

    private String comentario;

    @OneToMany(mappedBy = "compra")
    private List<CompraProducto> producto;


}
