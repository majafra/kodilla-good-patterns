package com.kodilla.good.patterns.Food2Door;

public class PurchaseProcessor {

    public void DifferentProducerProcess(PurchaseRequest purchaseRequest) {

        purchaseRequest.getProducer().process(purchaseRequest);
    }
}
