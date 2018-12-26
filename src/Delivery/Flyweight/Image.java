package Delivery.Flyweight;

import Delivery.Bridge.Implem.Implementation;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image {

    /*
    Отрисовка спрайта в положении x, y
     */

    public BufferedImage image;
    public void draw(Implementation impl, int x, int y)
    {
        impl.display(image, x, y);
    }

    public void setImage(String path) throws IOException
    {
        image = ImageIO.read(new File(path));
    }
}
