package Client.Adapter;

import Client.Decorator.Client;

public class NotResidentAdapter implements Client {

    private NotResident notResident;

    public NotResidentAdapter(NotResident notResident) {
        this.notResident = notResident;
    }

    @Override
    public void contact() {
        notResident.DrawupDocuments();
    }

    @Override
    public int getX() {
        return notResident.getX();
    }

    @Override
    public int getY() {
        return notResident.getY();
    }
}
