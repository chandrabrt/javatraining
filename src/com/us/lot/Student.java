package com.us.lot;

/*
  @author : Chandra Khadka
  @since : 2021-01-26
*/
public class Student {

    private String name;
    private Gender gender;
    private String address;
    private static String collegeName = "nihareeka";


    public Student(){

    }
    public Student(String name, Gender gender, String address) {
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        Student.collegeName = collegeName;
    }
}
