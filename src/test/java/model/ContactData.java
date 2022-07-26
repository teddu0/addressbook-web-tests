package model;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String address;
    private String group;

    public ContactData(String firstName, String lastName, String address, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getGroup() {return  group; }
}
