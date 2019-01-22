package Delivery;
import Behavior.Visitor.Visitor;
import Delivery.Bridge.Abstraction.Vehicle;
import Pack.Composite.Package;


public class ByPlane extends IDeliveryTech {

    private Vehicle vehicle;

    public ByPlane(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void toDeliver(Package pack) {
//        System.out.println(" is flying in some aircraft");
        vehicle.setCoords(pack.x, pack.y);

        vehicle.display();
    }

    @Override
    public void correctRoute(int[][] newRoute) {
        vehicle.setRoute(newRoute);
        vehicle.display();
    }

    @Override
    void accept(Visitor v) {
        v.visit(this);
    }

    public void checkSchedule() {
        System.out.println("Check schedule");
    }
}
