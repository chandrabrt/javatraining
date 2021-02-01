package com.us.lot;

/*
  @author : Chandra Khadka
  @since : 2021-02-01
*/
public class Student {
    private String name;
    private String address;

    public Student() {
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
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
