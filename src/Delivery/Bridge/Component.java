package Delivery.Bridge;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Component extends JComponent {
    private BufferedImage bufferedImage;
    private int x, y;

    public void setCoords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Component(BufferedImage bufferedImage, int x, int y) {
        this.bufferedImage = bufferedImage;
        setCoords(x, y);
    }

    @Override
    public void print(Graphics g) {
        g.drawImage(bufferedImage, x, y, this);
    }
}
