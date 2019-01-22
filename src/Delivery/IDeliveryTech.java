package Delivery;
import Pack.Composite.Package;
import Behavior.Visitor.Visitor;

public abstract class IDeliveryTech {

    abstract void toDeliver(Package pack);
    abstract void correctRoute(int[][] newRoute);
    abstract void accept(Visitor v);
}
