package com.example.transport;

public class CargoTruck extends Truck {
    @Override
    public void getDeliveryTime() {
        System.out.println("Your product will be delivered within 2 week.");
    }

    @Override
    public void getDeliveryType() {
        System.out.println("Your product will be delivered with a CargoTruck.");
    }
}
