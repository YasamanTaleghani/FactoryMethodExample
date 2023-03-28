package com.example.transport;

public class Customer {
    private Consignment consignment;
    private String customerName;
    private Transport transport;

    public Customer(Consignment consignment) {
        this.consignment = consignment;
    }

    public Customer(Consignment consignment, String customerName) {
        this.consignment = consignment;
        this.customerName = customerName;
    }

    public void createTransport() {
        if (consignment.getTransportType() == TransportType.SEA && consignment.getWeight() < 1000) {
            transport = new CargoBoat();
        } else if (consignment.getTransportType() == TransportType.SEA && consignment.getWeight() > 1000) {
            transport = new BigBoat();
        } else if (consignment.getTransportType() == TransportType.ROAD && consignment.getWeight() < 1000) {
            transport = new CargoTruck();
        } else if (consignment.getTransportType() == TransportType.ROAD && consignment.getWeight() > 1000) {
            transport = new BigTruck();
        }
        System.out.println("Your transport is created.");
    }

    public void getTransportDetails() {
        transport.getDeliveryTime();
        transport.getDeliveryType();
    }
}
