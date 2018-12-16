package Pack.Composite;

import Pack.Iterator.CompositeIterator;
import Pack.Iterator.Iterator;

import java.util.ArrayList;

public class CompositePackage extends Package {
    private ArrayList<Package> packages = new ArrayList<>();

    public CompositePackage(String name) {
        super(name);
    }

    @Override
    public void printName() {
        for (Package pack: packages) {
            pack.printName();
        }
    }

    public void add(Package pack) {
        packages.add(pack);
    }

    public void remove(Package pack) {
        packages.remove(pack);
    }

    public Iterator createIterator() {
        return new CompositeIterator(packages);
    }
}
