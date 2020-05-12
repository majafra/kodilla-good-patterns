package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface PurchaseService {

    public boolean sell(User user, LocalDateTime purchaseAt,LocalDateTime deliveryAt);
}
//purchaseService.sell(purchaseRequest.getUser(), purchaseRequest.getProduct(),
//        purchaseRequest.getTo());