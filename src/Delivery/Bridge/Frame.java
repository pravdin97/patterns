package Delivery.Bridge;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Frame {
    public static JFrame frame;
    public static JPanel panel;

    public static void init() {
        frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 300, 300);
        panel = new JPanel();
        frame.setContentPane(panel);

//        try {
//            BufferedImage bufferedImage;
//
//            bufferedImage = ImageIO.read(new File("res\\car.png"));
//            panel.add(new JLabel(new ImageIcon(bufferedImage)));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        frame.setVisible(true);
    }

    public static void print(BufferedImage bufferedImage, int x, int y) {
        Component component = new Component(bufferedImage, x, y);
        panel.add(component);
        component.paint(frame.getGraphics());
        frame.repaint();
    }
}
