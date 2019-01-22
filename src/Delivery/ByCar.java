package Delivery;
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

        int[][] route = new int[NUMSTEPS+1][2];

        vehicle.getImpl().clearArea();

        if (x0 == x1)
        {
            step = (y1 - y0) / NUMSTEPS;

            for (int y = y0; y <= y1; y += step)
            {
//                vehicle.setCoords(x0, y);
//                vehicle.display();

                //формируем маршрут
                route[k][0] = x0;
                route[k][1] = y;
                k++;

                if (step == 0)
                    break;
            }
            vehicle.setRoute(route);
            vehicle.display();
        }
        else {
            step = (x1 - x0) / NUMSTEPS;

            //поменять цикл!!!
            for (int x = x0; x <= x1; x += step) {

                int y = getNewY(x, y0, y1, x0, x1);

                //формируем маршрут
                route[k][0] = x;
                route[k][1] = y;
                k++;

                if (step == 0)
                    break;
            }

            vehicle.setRoute(route);
            vehicle.display();
        }
    }

    private int getNewY(int x, int y0, int y1, int x0, int x1) {
        return y0 + ((y1 - y0) / (x1 - x0) * (x - x0));
    }
}
