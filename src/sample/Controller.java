package sample;

import Behavior.Command.Command;
import Behavior.Command.DeliverCommand;
import Client.Decorator.Man;
import Client.Decorator.Reciever;
import Client.Decorator.Sender;
import Delivery.Bridge.Implem.Draw;
import Delivery.Bridge.Implem.Implementation;
import Delivery.Flyweight.Image;
import ModelView.DeliveryView;
import Pack.Composite.Order;
import Pack.Facade;
import Pack.InformExpert;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

    @FXML
    TextField senderName;

    @FXML
    TextField senderX;

    @FXML
    TextField senderY;

    @FXML
    TextField recieverName;

    @FXML
    TextField recieverX;

    @FXML
    TextField recieverY;

    @FXML
    TextField orderName;

    @FXML
    TextField orderSize1;

    @FXML
    TextField orderSize2;

    @FXML
    Label countOrders;

    @FXML
    Canvas canvas;


    public void init(Scene scene) {
        Image image = new Image();
        try {
            image.setImage(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
        impl = new Draw(scene);
//        impl = new Text();

        deliveryView = new DeliveryView(impl, image);
        informExpert = new InformExpert(deliveryView.getDelivery());
    }

    private DeliveryView deliveryView;

    private InformExpert informExpert;
    private Implementation impl;

    private String car = "./res/car1.png";
    private String train = "./res/train.jpg";


    @FXML
    public void toDeliver() {

        Sender sender = new Sender(new Man(senderName.getText(), Integer.parseInt( senderX.getText() ), Integer.parseInt( senderY.getText() )) );
        Reciever reciever = new Reciever(new Man(recieverName.getText(), Integer.parseInt( recieverX.getText() ), Integer.parseInt( recieverY.getText() )) );

        Facade facade = new Facade(deliveryView.getDelivery());

        int[] size = new int[] { Integer.parseInt(orderSize1.getText() ) , Integer.parseInt(orderSize2.getText() ) };
        Order o = facade.makeOrder(sender, reciever, size, orderName.getText());

        clearText();

        informExpert.count();

        countOrders.setText("" + informExpert.countOrders);

        Command deliverCommand = new DeliverCommand(deliveryView.getDelivery(), o, deliveryView.getVehicle());
        deliverCommand.execute();

//        deliveryView.getDelivery().toDeliverOrder(o, deliveryView.getVehicle());
    }

    private void clearText() {
        senderName.setText("");
        senderX.setText("");
        senderY.setText("");
        recieverName.setText("");
        recieverX.setText("");
        recieverY.setText("");
        orderName.setText("");
        orderSize1.setText("");
        orderSize2.setText("");
    }
}
