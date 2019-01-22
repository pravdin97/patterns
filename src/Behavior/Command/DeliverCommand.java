package Behavior.Command;

import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Delivery;
import Pack.Composite.Package;

public class DeliverCommand extends Command {


    public DeliverCommand(Delivery delivery, Package order, Vehicle vehicle) {
        super(delivery, order, vehicle);
    }

    @Override
    public void execute() {
        delivery.toDeliverOrder(order, vehicle);
    }
}
