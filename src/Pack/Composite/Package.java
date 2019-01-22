package Pack.Composite;

import java.util.Random;

public abstract class Package {
    protected String name;
    public int x, y;
    public int xFinish, yFinish;
    protected long number;

    public Package(String name) {
        Random random = new Random();
        number = 10000 + random.nextInt(99999 - 9999);
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public abstract void printName();
}
