package Delivery.Bridge.Abstraction.Factory;

import Delivery.Bridge.Abstraction.Plane;
import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Bridge.Implem.Implementation;
import Delivery.Flyweight.Image;

public class PlaneFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(Implementation impl, Image img) {
        return new Plane(impl, img);
    }
}
