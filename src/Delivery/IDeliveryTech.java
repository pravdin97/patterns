package Delivery;
import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Flyweight.Image;
import Pack.Composite.Package;

public abstract class IDeliveryTech {

    abstract void toDeliver(Package pack);
}
