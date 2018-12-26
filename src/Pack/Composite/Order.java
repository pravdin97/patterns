package Pack.Composite;

import Client.Decorator.Client;

public class Order extends Package implements Prototype{
    private Client sender;
    private Client reciever;
    private int[] size;

    public Order(Client sender, Client reciever, int[] size, String name) {
        super(name);
        this.sender = sender;
        this.reciever = reciever;
        this.size = size;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public Order clone(Client newRec) {
        return new Order(sender, newRec, size, name);
    }
}
