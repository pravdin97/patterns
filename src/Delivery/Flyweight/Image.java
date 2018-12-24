package Delivery.Flyweight;

import Delivery.Bridge.Implem.Implementation;

import java.awt.image.BufferedImage;

public class Image {

    /*
    Отрисовка спрайта в положении x, y
     */

    private BufferedImage image;
    public void draw(Implementation impl, int x, int y)
    {
        impl.display(image, x, y);
    }
}
