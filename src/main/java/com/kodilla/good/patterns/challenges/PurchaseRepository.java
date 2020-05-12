package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface PurchaseRepository {
    public void createPurchase(User user, LocalDateTime purchaseAt,LocalDateTime deliveryAt);
}
