package Delivery;

import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Flyweight.Image;
import Pack.Composite.Package;

import java.io.IOException;

public class CarDelivery extends Delivery {

    public CarDelivery(Vehicle vehicle){
        super(vehicle);

        ByCar byCar = new ByCar(vehicle);
        techs.add(byCar);
    }

    @Override
    public void toDeliverOrder(Package pack, Vehicle vehicle) {
        techs.get(0).toDeliver(pack);
    }
}
