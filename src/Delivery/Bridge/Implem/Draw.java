package Delivery.Bridge.Implem;

import Delivery.Flyweight.Image;

public class Draw extends Implementation {
    @Override
    public void display(Image img, int x, int y) {
        img.draw(x, y);
    }
}
