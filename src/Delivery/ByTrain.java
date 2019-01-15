package Delivery;
import Delivery.Bridge.Abstraction.Car;
import Delivery.Bridge.Abstraction.Train;
import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Bridge.Implem.Draw;
import Delivery.Bridge.Implem.Text;
import Pack.Composite.Package;


public class ByTrain extends IDeliveryTech {

    private Vehicle vehicle;

    public ByTrain(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void toDeliver(Package pack) {

//        System.out.println(" is delivering by train");
        vehicle.setCoords(pack.x, pack.y);

        vehicle.display();
    }
}
