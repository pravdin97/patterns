package Delivery.Bridge;

public class Vehicle {

    private Implementation impl;
    private int x, y;

    public Vehicle(Implementation impl) {
        this.impl = impl;
    }
}
