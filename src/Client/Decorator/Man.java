package Client.Decorator;

import Client.Decorator.Client;

public class Man implements Client {
    public String name;
    protected int x, y;

    public Man(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public void contact() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
