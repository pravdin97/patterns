package Pack;

import Client.Decorator.Client;
import Delivery.Delivery;
import Pack.Composite.CompositePackage;
import Pack.Composite.Order;
import Pack.Composite.Package;

import java.util.ArrayList;

public class Facade {
    private Delivery company;

    public Facade(Delivery company) {
        this.company = company;
    }

    public Order makeOrder(Client sender, Client reciever, int[] size, String name) {
        Order order = new Order(sender, reciever, size, name);
        company.addPack(order);
        return order;
    }

    public void fillComposite(Order order) {
        ArrayList<Package> packs = company.getPackages();

        for (Package p : packs) {
            if (p.getClass() == CompositePackage.class) {
                CompositePackage pa = (CompositePackage) p;
                pa.add(order);
            }
        }
    }

    public void newComposite(Order[] orders) {
        CompositePackage compositePackage = new CompositePackage("new");

        for (Order o: orders) {
            compositePackage.add(o);
        }
        company.addPack(compositePackage);
    }
}
