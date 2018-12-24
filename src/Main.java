import Client.Adapter.NotResident;
import Client.Adapter.NotResidentAdapter;
import Client.Decorator.Client;
import Client.Decorator.Man;
import Client.Decorator.Reciever;
import Client.Decorator.Sender;
import Delivery.*;
import Pack.Composite.CompositePackage;
import Pack.Composite.Order;
import Pack.Iterator.Iterator;

public class Main {
    public static void main(String[] args){
        Delivery del = new CarDelivery();

        Client client1 = new Man("Sender");
        Client client2 = new Man("Reciever");
        NotResident notResident = new NotResident("fn", "ln", "sn", "rus", "brn");
        Client client3 = new NotResidentAdapter(notResident);

        Sender sender = new Sender(client1);
        Reciever reciever = new Reciever(client2);
        Sender sender2 = new Sender(client3);

        int[] size = new int[] {2, 2};
        Order pack1 = new Order(sender, reciever,size, "pack1");
        Order pack2 = new Order(sender2, reciever,size, "pack2");
        CompositePackage compositePackage = new CompositePackage("packs");
        compositePackage.add(pack1);
        compositePackage.add(pack2);

        del.addPack(compositePackage);
        del.performDelivery();

        Iterator it = compositePackage.createIterator();
        while(it.hasNext())
        {
            Order o = (Order)it.next();
            o.printName();
        }

    }
}
