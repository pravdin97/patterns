package Delivery;
import Delivery.Bridge.Abstraction.Car;
import Delivery.Bridge.Abstraction.Factory.CarFactory;
import Delivery.Bridge.Abstraction.Factory.VehicleFactory;
import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Bridge.Implem.Draw;
import Delivery.Bridge.Implem.Text;
import Delivery.Flyweight.Image;
import Pack.Composite.Package;

import java.io.IOException;

public class ByCar extends IDeliveryTech {

    private Vehicle vehicle;

    @Override
    public void toDeliver(Package pack) {
        //System.out.println("I'm driving ");

        VehicleFactory cf = new CarFactory();
        vehicle = cf.createVehicle(new Draw(), image);

//        vehicle = new Car(new Draw(), image);
        vehicle.setCoords(pack.x, pack.y);

        vehicle.display();
    }
}
