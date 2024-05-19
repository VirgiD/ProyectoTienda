package com.edp.proyectoTienda.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseProductPK {

    private int purchaseId;

    private int productId;

    public PurchaseProductPK(int purchaseId, int productId) {
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
