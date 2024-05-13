package com.edp.proyectoTienda.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Category {

    private int categoryId;

    private boolean state;

    private String description;

}
