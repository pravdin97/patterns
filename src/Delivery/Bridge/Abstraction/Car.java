package Delivery.Bridge.Abstraction;

import Delivery.Bridge.Implem.Implementation;
import Delivery.Flyweight.Image;

public class Car extends Vehicle {

    public Car(Implementation impl, Image img)
    {
        super(impl, img);
    }

    @Override
    public void display() {
        image.draw(impl, x, y);
    }
}
