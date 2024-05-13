package com.edp.proyectoTienda.domain;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Product {

    private int productId;

    private String name;

    private int categoryId;

    private int stock;

    private Category category;

    private boolean state;

    private int price;


}
