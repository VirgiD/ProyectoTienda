package com.edp.proyectoTienda.domain;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Product {

    private int productID;

    private String name;

    private int categoryId;

    private Category category;

    private boolean state;

    private int price;


}
