package Delivery.Bridge.Implem;

import Delivery.Flyweight.Image;

public class Text extends Implementation {

    @Override
    public void display(Image img, int x, int y) {
        System.out.println("Средство доставки сейчас находится в ("
                + x + ", " + y + ")");
    }
}
