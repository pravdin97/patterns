package Delivery;

import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Flyweight.Image;
import Pack.Composite.Package;

public class AirDelivery extends Delivery {

    public AirDelivery(Vehicle vehicle)
    {
        super(vehicle);
        ByPlane byPlane = new ByPlane(vehicle);
        techs.add(byPlane);
    }

    @Override
    public void toDeliverOrder(Package pack, Vehicle vehicle) {
        techs.get(0).toDeliver(pack);
    }
}
