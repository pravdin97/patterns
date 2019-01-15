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

    @Override
    public int getX() {
        return client.getX();
    }

    @Override
    public int getY() {
        return client.getY();
    }
}
