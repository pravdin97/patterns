package Behavior.Visitor;

import Delivery.ByCar;
import Delivery.ByPlane;
import Delivery.ByTrain;

public class CorrectPath implements Visitor {
    private int[][] newPath;

    public CorrectPath(int[][] newPath) {
        this.newPath = newPath;
    }

    @Override
    public void visit(ByCar c) {
        c.correctRoute(newPath);
    }

    @Override
    public void visit(ByPlane c) {
    }

    @Override
    public void visit(ByTrain c) {
    }
}
