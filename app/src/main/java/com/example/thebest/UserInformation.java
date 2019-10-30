package com.example.thebest;

public class UserInformation {

    public String name;
    public String address;
    public String phone;

    public UserInformation(){

    }

    public UserInformation(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public UserInformation(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

