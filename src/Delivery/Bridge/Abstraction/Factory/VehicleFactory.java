package Delivery.Bridge.Abstraction.Factory;

import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Bridge.Implem.Implementation;
import Delivery.Flyweight.Image;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle(Implementation impl, Image img);
}
