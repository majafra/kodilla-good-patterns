package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new GuitarInformationService(), new GuitarPurchaseService(), new GuitarPurchaseRepository());
        productOrderService.process(purchaseRequest);
    }
}
