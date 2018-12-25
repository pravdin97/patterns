package Delivery;
import Delivery.Flyweight.Image;
import Pack.Composite.Package;

public abstract class IDeliveryTech {

    protected Image image;

    public void setImage(Image image) {
        this.image = image;
    }

    abstract void toDeliver(Package pack);
}
