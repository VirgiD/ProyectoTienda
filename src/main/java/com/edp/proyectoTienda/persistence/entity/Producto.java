package com.edp.proyectoTienda.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.metamodel.IdentifiableType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_productos")
    private Integer id_producto;

    private String name;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

    @Column(name="codigo_barras")
    private String CodigoDeBarras;

    @Column(name="precio_venta")
    private Integer precioDeVenta;

    @Column(name="cantidad_stock")

    private Boolean estado;






}
