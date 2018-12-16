package Pack.Iterator;

import Pack.Composite.Package;

import java.util.ArrayList;

public class CompositeIterator implements Iterator{

//    Package[] items;
    ArrayList<Package> items;
    int pos;

    public CompositeIterator(ArrayList<Package> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (pos >= items.size() || items.get(pos) == null)
            return false;
        return true;
    }

    @Override
    public Object next() {
        Package pkg = items.get(pos);
        pos++;
        return pkg;
    }
}
