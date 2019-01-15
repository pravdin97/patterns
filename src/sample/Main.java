package sample;

import Delivery.CarDelivery;
import Pack.Composite.Prototype;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Parent root = (Parent)fxmlLoader.load();
        primaryStage.setTitle("Delivery");
        Scene scene = new Scene(root, 1055, 884);
        primaryStage.setScene(scene);
        Controller controller = fxmlLoader.getController();
        controller.init(scene);

        // пример получения элемента
//        Canvas canvas = (Canvas) scene.lookup("#canvas");


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
