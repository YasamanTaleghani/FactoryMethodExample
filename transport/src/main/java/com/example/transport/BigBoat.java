package com.example.transport;

public class BigBoat extends Ship {

    @Override
    public void getDeliveryTime() {
        System.out.println("Your product will be delivered within 4 week.");
    }

    @Override
    public void getDeliveryType() {
        System.out.println("Your product will be delivered with a BigBoat.");
    }
}
