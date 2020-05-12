package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class PurchaseRequest {

    private User user;
    private LocalDateTime dateOfPurchase;
    private LocalDateTime dateOfDelivery;

    public PurchaseRequest(User user, LocalDateTime dateOfPurchase, LocalDateTime dateOfDelivery) {
        this.user = user;
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfDelivery = dateOfDelivery;
    }

    public User getUser() {
        return user;
    }


    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }

    public LocalDateTime getDateOfDelivery() {
        return dateOfDelivery;
    }
}
