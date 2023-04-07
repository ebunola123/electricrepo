package com.example.amplifyelectrics;

public class ModelAdmin {

    String email;

    public ModelAdmin(String email) {
        this.email = email;
    }

    public ModelAdmin(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
