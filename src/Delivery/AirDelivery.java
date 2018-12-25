package Delivery;

import Delivery.Flyweight.Image;

public class AirDelivery extends Delivery {

    public AirDelivery(Image img)
    {
        super();
        ByPlane byPlane = new ByPlane();
        byPlane.setImage(img);
        techs.add(byPlane);
    }
}
