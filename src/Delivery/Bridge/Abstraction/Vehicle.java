package Delivery.Bridge.Abstraction;

import Delivery.Bridge.Implem.Implementation;
import Delivery.Flyweight.Image;

public abstract class Vehicle {

    protected Implementation impl;
    protected int x, y;
    protected Image image;
    protected int[][] route;

    public Vehicle(Implementation impl, Image img) {
        this.impl = impl;
        this.image = img;
    }

    public abstract void display();

    public void setImpl(Implementation impl) {
        this.impl = impl;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setCoords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setRoute(int[][] route) {
        this.route = route;
    }

    public Implementation getImpl() {
        return impl;
    }
}
