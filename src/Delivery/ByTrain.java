package Delivery;
import Pack.Composite.Package;


public class ByTrain implements IDeliveryTech {
    @Override
    public void toDeliver(Package pack) {
        System.out.println(" is delivering by train");
    }
}
