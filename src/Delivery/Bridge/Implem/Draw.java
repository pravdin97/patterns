package Delivery.Bridge.Implem;

import javafx.animation.AnimationTimer;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;

import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

public class Draw extends Implementation {
    Scene scene;

    public Draw(Scene scene) {
        this.scene = scene;
    }

    public Draw() {}

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    protected AnimationTimer at = new AnimationTimer() {
        @Override
        public void handle(long now) {
            //пауза
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            display1();
        }
    };

    @Override
    public void display(BufferedImage img, int x, int y)
    {
        clearArea();
        Canvas canvas = (Canvas) scene.lookup("#canvas");

        javafx.scene.image.Image image = SwingFXUtils.toFXImage(img, null);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.drawImage(image, x, y, 15, 15);
    }

    @Override
    public void clearArea() {
        Canvas canvas = (Canvas) scene.lookup("#canvas");

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    private int currPoint;
    private BufferedImage currImage;
    private int[][] currRoute;

    @Override
    public void displayRoute(BufferedImage img, int[][] route) {
        currPoint = 0;
        currImage = img;
        currRoute = route;
        at.start();
    }

    private void display1() {
        if (currPoint == currRoute.length - 1) {
            at.stop();
            SuccessMessage();
            return;
        }

        currPoint++;

        display(currImage, currRoute[currPoint][0], currRoute[currPoint][1]);
    }

    private void SuccessMessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Доставка");
        alert.setHeaderText(null);
        alert.setContentText("Заказ доставлен");

//        alert.showAndWait();
        alert.show();
    }

}
