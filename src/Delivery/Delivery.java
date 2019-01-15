package Delivery;

import java.util.ArrayList;

import Delivery.Bridge.Abstraction.Vehicle;
import Pack.Composite.Package;


public abstract class Delivery {
    protected ArrayList<IDeliveryTech> techs;
    protected ArrayList<Package> packages;
    protected Vehicle vehicle;

    public Delivery(Vehicle vehicle){
        techs = new ArrayList<>();
        packages = new ArrayList<>();
        this.vehicle = vehicle;
    }

    public void addDeliveryTech(IDeliveryTech deliveryTech)
    {
        techs.add(deliveryTech);
    }

    public void addPack(Package pack)
    {
        packages.add(pack);
    }

    public void performDelivery()
    {
        for (Package pack : packages)
            for(IDeliveryTech tech : techs)
                tech.toDeliver(pack);
    }

    public abstract void toDeliverOrder(Package pack, Vehicle vehicle);

    public ArrayList<Package> getPackages() {return packages; }
}
