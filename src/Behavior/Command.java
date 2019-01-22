package Behavior;

import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Delivery;
import Pack.Composite.Package;

public abstract class Command {
    protected Delivery delivery;
    protected Package order;
    protected Vehicle vehicle;

    public Command(Delivery delivery, Package order, Vehicle vehicle) {
        this.delivery = delivery;
        this.order = order;
        this.vehicle = vehicle;
    }

    public abstract void execute();
}
