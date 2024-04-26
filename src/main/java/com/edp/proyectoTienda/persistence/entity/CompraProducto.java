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

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="compra_producto")
public class CompraProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id-compras-productos")

    private Integer idCompra;

    private LocalDateTime fecha;;

    private Double modo_pago;

    private String comentario;

    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "id_compra")
    private CompraProductoPK compra;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

}
