package Behavior.Command;

import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Delivery;
import Pack.Composite.Package;

public class DenyCommand extends Command{
    public DenyCommand(Delivery delivery, Package order, Vehicle vehicle) {
        super(delivery, order, vehicle);
    }

    @Override
    public void execute() {
        delivery.dropPackage(order);
    }
}
