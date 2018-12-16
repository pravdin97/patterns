package Client.Decorator;

public class Reciever extends RoleDecorator {
    public Reciever(Client client) {
        super(client);
    }

    @Override
    public void contact() {
        System.out.println("Recieve order");
        super.contact();
    }
}
