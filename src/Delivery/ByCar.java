package Delivery;
import Pack.Composite.Package;

public class ByCar implements IDeliveryTech {
    @Override
    public void toDeliver(Package pack) {
        System.out.println("I'm driving ");
    }
}
