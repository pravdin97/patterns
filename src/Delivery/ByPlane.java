package Delivery;
import Pack.Composite.Package;

public class ByPlane implements IDeliveryTech {
    @Override
    public void toDeliver(Package pack) {
        System.out.println(" is flying in some aircraft");
    }
}
