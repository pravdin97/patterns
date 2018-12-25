package Delivery;
import Delivery.Bridge.Abstraction.Car;
import Delivery.Bridge.Abstraction.Train;
import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Bridge.Implem.Draw;
import Pack.Composite.Package;


public class ByTrain extends IDeliveryTech {

    private Vehicle vehicle;

    @Override
    public void toDeliver(Package pack) {

//        System.out.println(" is delivering by train");
        vehicle = new Train(new Draw(), image);
        vehicle.setCoords(pack.x, pack.y);

        vehicle.display();
    }
}
