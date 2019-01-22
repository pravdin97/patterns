package Delivery;
import Behavior.Visitor.Visitor;
import Delivery.Bridge.Abstraction.Car;
import Delivery.Bridge.Abstraction.Factory.CarFactory;
import Delivery.Bridge.Abstraction.Factory.VehicleFactory;
import Delivery.Bridge.Abstraction.Vehicle;
import Delivery.Bridge.Implem.Draw;
import Delivery.Bridge.Implem.Text;
import Delivery.Flyweight.Image;
import Pack.Composite.Order;
import Pack.Composite.Package;

import java.io.IOException;

public class ByCar extends IDeliveryTech {
    private static final int NUMSTEPS = 10;
    private static final double eps = 0.1;

    private Vehicle vehicle;

    public ByCar(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void toDeliver(Package pack) {
        //начальные и конечные координаты
        int x0 = ((Order)pack).x;
        int x1 = ((Order)pack).xFinish;
        int y0 = ((Order)pack).y;
        int y1 = ((Order)pack).yFinish;

        int step, k = 0;

        int[][] route = new int[NUMSTEPS][2];

        vehicle.getImpl().clearArea();

        if (x0 == x1)
        {
            step = (y1 - y0) / NUMSTEPS;

            int y = y0;
            for (int i = 0; i < NUMSTEPS; i++)
            {
//                vehicle.setCoords(x0, y);
//                vehicle.display();

                //формируем маршрут
                route[k][0] = x0;
                route[k][1] = y;
                k++;
                y += step;

                if (step == 0)
                    break;
            }

            vehicle.setRoute(route);
            vehicle.display();
        }
        else {
            step = (x1 - x0) / NUMSTEPS;

            int x = x0;
            for (int i = 0; i < NUMSTEPS; i++) {
                int y = getNewY(x, y0, y1, x0, x1);

                //формируем маршрут
                route[k][0] = x;
                route[k][1] = y;
                k++;
                x += step;

                if (step == 0)
                    break;

            }

            vehicle.setRoute(route);
            vehicle.display();
        }
    }

    @Override
    public void correctRoute(int[][] newRoute) {
        vehicle.setRoute(newRoute);
        vehicle.display();
    }

    @Override
    void accept(Visitor v) {
        v.visit(this);
    }

    private int getNewY(int x, int y0, int y1, int x0, int x1) {
        return y0 + ((y1 - y0) / (x1 - x0) * (x - x0));
    }
}
