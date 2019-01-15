package ModelView;

import Delivery.Bridge.Abstraction.Car;
import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Bridge.Implem.Implementation;
import Delivery.*;
import Delivery.Flyweight.Image;

public class DeliveryView {
    private Delivery delivery;
    private Vehicle vehicle;

    public DeliveryView(Implementation impl, Image image) {
        vehicle = new Car(impl, image);
        delivery = new CarDelivery(vehicle);
    }


    public Delivery getDelivery() {
        return delivery;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
