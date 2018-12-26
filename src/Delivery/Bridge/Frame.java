package Delivery.Bridge;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Frame {
    private JFrame frame;
    private static Frame fr;

    public void print(BufferedImage bufferedImage, int x, int y) {
        frame.getGraphics().drawImage(bufferedImage, x, y, null);
    }

    public static Frame getInstance() {
        if (fr == null)
            fr = new Frame();
        return fr;
    }

    private Frame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);    }
}
