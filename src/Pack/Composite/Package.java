package Pack.Composite;

public abstract class Package {
    protected String name;
    public int x, y;
    public int xFinish, yFinish;

    public Package(String name) {
        this.name = name;
    }

    public abstract void printName();
}
