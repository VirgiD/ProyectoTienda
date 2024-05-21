package com.edp.proyectoTienda.domain;


import jakarta.persistence.EmbeddedId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PurchaseProduct {

    @EmbeddedId
    private PurchaseProductPK id;

    private int quantity;

    private int total;

    private boolean state;

    private Product product;

    private Purchase purchase;

    public PurchaseProduct() {
    }

    public PurchaseProduct(PurchaseProductPK id, int quantity, int total, boolean state, Product product, Purchase purchase) {
        this.id = id;
        this.quantity = quantity;
        this.total = total;
        this.state = state;
        this.product = product;
        this.purchase = purchase;
    }

    public PurchaseProductPK getId() {
        return id;
    }

    public void setId(PurchaseProductPK id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}
