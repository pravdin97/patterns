import Client.Adapter.NotResident;
import Client.Adapter.NotResidentAdapter;
import Client.Decorator.Client;
import Client.Decorator.Man;
import Client.Decorator.Reciever;
import Client.Decorator.Sender;
import Delivery.*;
import Delivery.Bridge.Frame;
import Delivery.Flyweight.Image;
import Pack.Composite.CompositePackage;
import Pack.Composite.Order;
import Pack.InformExpert;
import Pack.Iterator.Iterator;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Image car = new Image();
        try {
            car.setImage("res\\car.png");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image train = new Image();
        try {
            train.setImage("res\\train.png");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Frame.init();

        Delivery del = new CarDelivery(car);
//        Delivery del_ = new TrainDelivery(train);

        Client client1 = new Man("Sender");
        Client client2 = new Man("Reciever");
        NotResident notResident = new NotResident("fn", "ln", "sn", "rus", "brn");
        Client client3 = new NotResidentAdapter(notResident);

        Sender sender = new Sender(client1);
        Reciever reciever = new Reciever(client2);
        Sender sender2 = new Sender(client3);

        int[] size = new int[] {2, 2};
        Order pack1 = new Order(sender, reciever,size, "pack1");
        pack1.x = 100; pack1.y = 100;
        Order pack2 = new Order(sender2, reciever,size, "pack2");
        pack2.x = 50; pack2.y = 50;
        CompositePackage compositePackage = new CompositePackage("packs");
        compositePackage.x = 10; compositePackage.y = 10;
        compositePackage.add(pack1);
        compositePackage.add(pack2);

        del.addPack(compositePackage);
        del.addPack(pack2);
        del.addPack(pack1);
        del.performDelivery();

//        pack1.x = 100; pack1.y = 100;
//        pack2.x = 200; pack2.y = 200;
//        del_.addPack(pack1);
//        del_.addPack(pack2);
//        del_.performDelivery();


        Iterator it = compositePackage.createIterator();
        while(it.hasNext())
        {
            Order o = (Order)it.next();
            o.printName();
        }

        InformExpert informExpert = new InformExpert(del);
        informExpert.count();
        System.out.println(informExpert.countOrders);

//        informExpert.setDelivery(del_);
//        informExpert.count();
//        System.out.println(informExpert.countOrders);
    }
}
