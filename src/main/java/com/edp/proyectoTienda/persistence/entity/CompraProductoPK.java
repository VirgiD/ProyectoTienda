package com.edp.proyectoTienda.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Embeddable
public class CompraProductoPK {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_compra")
    private Integer idCompra;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Clientes clientes;


}
