package com.kodilla.good.patterns.Food2Door;

public class PurchaseProcessor {

    public void differentProducerProcess(PurchaseRequest purchaseRequest) {

        Producer producer=null;

        if (purchaseRequest.getNameOfProducer() == "ExtraFoodShop")
            producer = new ExtraFoodShop();
        if (purchaseRequest.getNameOfProducer() == "GlutenFreeShop")
            producer = new GlutenFreeShop();
        if (purchaseRequest.getNameOfProducer() == "HealthyShop")
            producer = new HealthyShop();

        producer.process(purchaseRequest);
    }
}
