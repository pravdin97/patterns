package Delivery.Bridge.Implem;

import Delivery.Flyweight.Image;

import java.awt.image.BufferedImage;

public abstract class Implementation {
    public abstract void display(BufferedImage img, int x, int y);
    public abstract void clearArea();
    public abstract void displayRoute(BufferedImage img, int[][] route);
}
