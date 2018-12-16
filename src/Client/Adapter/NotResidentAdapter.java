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
}
