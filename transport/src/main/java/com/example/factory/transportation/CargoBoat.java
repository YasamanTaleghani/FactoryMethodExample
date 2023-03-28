package com.example.factory.transportation;

public class CargoBoat extends Ship {

    @Override
    public void getDeliveryTime() {
        System.out.println("Your product will be delivered within 1 week.");
    }

    @Override
    public void getDeliveryType() {
        System.out.println("Your product will be delivered with a CargoBoat.");
    }
}
