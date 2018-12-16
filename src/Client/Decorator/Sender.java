package Client.Decorator;

public class Sender extends RoleDecorator {
    public Sender(Client client) {
        super(client);
    }

    @Override
    public void contact() {
        System.out.println("Send package");
        super.contact();
    }
}
