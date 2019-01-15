package Delivery;

import Delivery.Bridge.Abstraction.Vehicle;
import Pack.Composite.Package;

public class MultiDelivery extends Delivery {

    public MultiDelivery(Vehicle vehicle){
        super(vehicle);
    }


    @Override
    public void toDeliverOrder(Package pack, Vehicle vehicle) {

    }
}
