package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;

public class PurchaseRequest {

    private String nameOfProducer;
    private String product;
    private LocalDateTime dateOfPurchase;
    private LocalDateTime dateOfDelivery;

    public PurchaseRequest(String nameOfProducer,String product, LocalDateTime dateOfPurchase, LocalDateTime dateOfDelivery) {
        this.nameOfProducer = nameOfProducer;
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfDelivery = dateOfDelivery;
    }

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public String getProduct() {
        return product;
    }

    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }

    public LocalDateTime getDateOfDelivery() {
        return dateOfDelivery;
    }
}
