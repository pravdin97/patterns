package Delivery.Bridge.Abstraction.Factory;

import Delivery.Bridge.Abstraction.Train;
import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Bridge.Implem.Implementation;
import Delivery.Flyweight.Image;

public class TrainFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(Implementation impl, Image img) {
        return new Train(impl, img);
    }
}
