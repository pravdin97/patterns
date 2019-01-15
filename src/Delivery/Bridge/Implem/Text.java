package Delivery.Bridge.Implem;

import Delivery.Flyweight.Image;

import java.awt.image.BufferedImage;

public class Text extends Implementation {

    @Override
    public void display(BufferedImage img, int x, int y) {
        System.out.println("Средство доставки сейчас находится в ("
                + x + ", " + y + ")");
    }

    @Override
    public void clearArea() {
        System.out.flush();
    }

    @Override
    public void displayRoute(BufferedImage img, int[][] route) {

    }
}
