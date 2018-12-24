package Delivery.Bridge.Abstraction;

import Delivery.Bridge.Implem.Implementation;
import Delivery.Flyweight.Image;

public class Plane extends Vehicle {
    public Plane(Implementation impl, Image img) {
        super(impl, img);
    }

    @Override
    public void display() {
        image.draw(impl, x, y);
    }
}
