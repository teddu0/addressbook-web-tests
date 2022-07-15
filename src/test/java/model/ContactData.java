package model;

import appmanager.ContactHelper;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String address;

    public ContactData (String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastNameName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
}
