package Delivery;
import Delivery.Bridge.Abstraction.Vehicle;
import Pack.Composite.Package;
import Pack.Composite.Prototype;


public class Proxy extends Delivery {
    private Delivery proxy;

    public Proxy(Vehicle vehicle)
    {
        super(vehicle);
        proxy = new MultiDelivery(vehicle);
    }


    @Override
    public void performDelivery() {
        proxy.performDelivery();
    }

    @Override
    public void toDeliverOrder(Package pack, Vehicle vehicle) {

    }

    @Override
    public void addPack(Package pack) {
        proxy.addPack(pack);
    }

    @Override
    public void addDeliveryTech(IDeliveryTech deliveryTech) {
        proxy.addDeliveryTech(deliveryTech);
    }
}
