package com.example.amplifyelectrics;

public class ModelCustomer {

    String firstName;
    String surname;
    String email;
    String addressLine1;
    String addressLine2;

    public ModelCustomer(String firstName, String surname, String email, String addressLine1, String addressLine2) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

    public ModelCustomer(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
}
