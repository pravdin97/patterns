package Delivery.Bridge.Abstraction.Factory;

import Delivery.Bridge.Abstraction.Car;
import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Bridge.Implem.Implementation;
import Delivery.Flyweight.Image;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle(Implementation impl, Image img) {
        return new Car(impl, img);
    }
}
