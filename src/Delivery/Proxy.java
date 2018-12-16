package Delivery;
import Pack.Composite.Package;


public class Proxy extends Delivery {
    private Delivery proxy;

    public Proxy()
    {
        proxy = new MultiDelivery();
    }

    @Override
    public void performDelivery() {
        proxy.performDelivery();
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
