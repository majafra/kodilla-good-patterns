package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;

public class PurchaseRequest {

    private Producer producer;
    private String product;
    private LocalDateTime dateOfPurchase;
    private LocalDateTime dateOfDelivery;

    public PurchaseRequest(Producer producer,String product, LocalDateTime dateOfPurchase, LocalDateTime dateOfDelivery) {
        this.producer = producer;
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfDelivery = dateOfDelivery;
    }

    public Producer getProducer() {
        return producer;
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
