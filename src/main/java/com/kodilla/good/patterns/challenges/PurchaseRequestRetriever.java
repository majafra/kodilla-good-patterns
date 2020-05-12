package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve(){

        User user = new User ("Pawel","Kowalski");

        LocalDateTime purchaseAt = LocalDateTime.of(2020,5,10,10,10);
        LocalDateTime deliveryAt = LocalDateTime.of(2020,5,12,10,10);

        return new PurchaseRequest (user,purchaseAt,deliveryAt);
    }
}
