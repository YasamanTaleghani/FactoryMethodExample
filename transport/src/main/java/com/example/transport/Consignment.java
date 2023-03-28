package com.example.transport;

public class Consignment {
    private Integer weight;
    private TransportType transportType;

    public Consignment(Integer weight, TransportType transportType) {
        this.weight = weight;
        this.transportType = transportType;
    }

    public Consignment() {
    }

    public Integer getWeight() {
        return weight;
    }

    public TransportType getTransportType() {
        return transportType;
    }
}
