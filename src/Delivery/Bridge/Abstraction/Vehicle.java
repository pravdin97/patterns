package Delivery.Bridge.Abstraction;

import Delivery.Bridge.Implem.Implementation;
import Delivery.Flyweight.Image;

public abstract class Vehicle {

    protected Implementation impl;
    protected int x, y;
    protected Image image;

    public Vehicle(Implementation impl, Image img) {
        this.impl = impl;
        this.image = img;
    }

    public abstract void display();
}
