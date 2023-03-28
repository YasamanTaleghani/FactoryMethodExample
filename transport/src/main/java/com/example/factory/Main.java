package com.example.factory;


import com.example.factory.product.Consignment;
import com.example.factory.product.Customer;
import com.example.factory.product.TransportType;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(new Consignment(2000, TransportType.SEA), "Joe Jonas");
        customer1.createTransport();
        customer1.getTransportDetails();
    }
}
