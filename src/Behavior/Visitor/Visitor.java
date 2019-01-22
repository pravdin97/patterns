package Behavior.Visitor;

import Delivery.ByCar;
import Delivery.ByPlane;
import Delivery.ByTrain;

public interface Visitor {
    void visit(ByCar c);
    void visit(ByPlane c);
    void visit(ByTrain c);
}
