package Delivery;

import Delivery.Flyweight.Image;

import java.io.IOException;

public class CarDelivery extends Delivery {

    public CarDelivery(Image img){
        super();

        ByCar byCar = new ByCar();
        byCar.setImage(img);
        techs.add(byCar);
    }
}
