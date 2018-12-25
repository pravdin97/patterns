package Delivery;

import Delivery.Flyweight.Image;

public class TrainDelivery extends Delivery {

    public TrainDelivery(Image img)
    {
        super();
        ByTrain byTrain = new ByTrain();
        byTrain.setImage(img);
        techs.add(byTrain);
    }
}
