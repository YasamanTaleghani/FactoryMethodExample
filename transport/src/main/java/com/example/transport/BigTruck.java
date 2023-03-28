package com.example.transport;

public class BigTruck extends Truck {
    @Override
    public void getDeliveryTime() {
        System.out.println("Your product will be delivered within 5 week.");
    }

    @Override
    public void getDeliveryType() {
        System.out.println("Your product will be delivered with a BigBoat.");
    }
}
