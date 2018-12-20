package Delivery;

import java.util.ArrayList;
import Pack.Composite.Package;


public class Delivery {
    protected ArrayList<IDeliveryTech> techs;
    protected ArrayList<Package> packages;

    public Delivery(){
        techs = new ArrayList<>();
        packages = new ArrayList<>();
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

    public ArrayList<Package> getPackages() {return packages; }
}
