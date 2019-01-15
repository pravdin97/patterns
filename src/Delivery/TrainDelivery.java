package Delivery;

import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Flyweight.Image;
import Pack.Composite.Package;

public class TrainDelivery extends Delivery {

    public TrainDelivery(Image img, Vehicle vehicle)
    {
        super(vehicle);
        ByTrain byTrain = new ByTrain(vehicle);
        techs.add(byTrain);
    }

    @Override
    public void toDeliverOrder(Package pack, Vehicle vehicle) {
        techs.get(0).toDeliver(pack);
    }
}
