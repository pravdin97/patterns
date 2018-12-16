package Client.Adapter;

public class NotResident {

    private String firstName;
    private String lastName;
    private String secondName;
    private String country;
    private String address;
    private String docs;

    public NotResident(String firstName, String lastName, String secondName, String country, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.country = country;
        this.address = address;
    }

    public void DrawupDocuments() {
        docs = "";
    }

}
