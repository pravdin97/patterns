package Client.Decorator;

import Client.Decorator.Client;

abstract class RoleDecorator implements Client {

    Client client;

    public RoleDecorator(Client client) {
        this.client = client;
    }

    @Override
    public void contact() {
        client.contact();
    }
}
