package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve(){

        Producer producer=new ExtraFoodShop();
        String product = "Bread";

        LocalDateTime purchaseAt = LocalDateTime.of(2020,5,10,10,10);
        LocalDateTime deliveryAt = LocalDateTime.of(2020,5,12,10,10);

        return new PurchaseRequest(producer,product,purchaseAt,deliveryAt);
    }
}