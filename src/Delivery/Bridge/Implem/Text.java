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

    private int currPoint;
    private BufferedImage currImage;
    private int[][] currRoute;

    @Override
    public void displayRoute(BufferedImage img, int[][] route) {
        currPoint = 0;
        currImage = img;
        currRoute = route;

        while(currPoint < currRoute.length)
        {
            display(currImage, currRoute[currPoint][0], currRoute[currPoint][1]);
            currPoint++;
        }
    }
}
