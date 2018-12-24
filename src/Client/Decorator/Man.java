package Client.Decorator;

import Client.Decorator.Client;

public class Man implements Client {
    public String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void contact() {

    }
}
