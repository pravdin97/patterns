import Delivery.*;

public class Main {
    public static void main(String[] args){
        Package pack1 = new Package("Box of pencils");
        Package pack2 = new Package("Money");
        Package pack3 = new Package("Glasses");

        Delivery airCompany = new AirDelivery();
        Delivery carCompany = new CarDelivery();
        Delivery multifunctionalCompany = new MultiDelivery();

        multifunctionalCompany.addDeliveryTech(new ByCar());
        multifunctionalCompany.addDeliveryTech(new ByTrain());

        airCompany.addPack(pack2);
        carCompany.addPack(pack1);
        multifunctionalCompany.addPack(pack3);
        multifunctionalCompany.addPack(pack2);

        System.out.println("Aircraft Company:");
        airCompany.performDelivery();
        System.out.println("----------------------------");

        System.out.println("Car Company:");
        carCompany.performDelivery();
        System.out.println("----------------------------");


        System.out.println("Multifunctional Company:");
        multifunctionalCompany.performDelivery();
        System.out.println("----------------------------");

        Proxy proxy = new Proxy();
        proxy.addPack(pack1);
        proxy.addDeliveryTech(new ByTrain());
        System.out.println("Delivery.Proxy:");
        proxy.performDelivery();
        System.out.println("----------------------------");
    }
}
