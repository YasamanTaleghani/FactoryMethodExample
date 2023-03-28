package com.example.transport;


public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(new Consignment(2000, TransportType.SEA), "Joe Jonas");
        customer1.createTransport();
        customer1.getTransportDetails();
    }
}
