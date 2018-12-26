package Delivery.Bridge.Implem;

import Delivery.Bridge.Frame;
import Delivery.Flyweight.Image;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Draw extends Implementation {

    public Draw() {
//        Frame.init();

    }
    @Override
    public void display(BufferedImage img, int x, int y)
    {
        //draw
        Frame.getInstance().print(img, x, y);
    }
}
