package Delivery;

public class AirDelivery extends Delivery {

    public AirDelivery()
    {
        super();
        techs.add(new ByPlane());
    }
}
