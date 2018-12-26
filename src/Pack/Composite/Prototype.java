package Pack.Composite;

import Client.Decorator.Client;

public interface Prototype {
    Order clone(Client newRec);
}
