package Pack;

import Delivery.Delivery;
import Pack.Composite.CompositePackage;
import Pack.Composite.Order;
import Pack.Composite.Package;
import Pack.Iterator.Iterator;

public class InformExpert {
    private Delivery company;
    public int countOrders;

    public InformExpert(Delivery company) {
        this.company = company;
    }

    public void count() {
        countOrders = 0;
        for (Package p : company.getPackages()) {
            if (p.getClass() == Order.class)
                countOrders++;
            else {
                CompositePackage cp = (CompositePackage) p;
                Iterator i = cp.createIterator();
                while (i.hasNext()) {
                    countOrders++;
                    i.next();
                }
            }
        }

    }

    public void setDelivery(Delivery delivery) {
        company = delivery;
    }
}
