package Pack.Composite;

public abstract class Package {
    String name;

    public Package(String name) {
        this.name = name;
    }

    public abstract void printName();
}
