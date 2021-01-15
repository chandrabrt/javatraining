package com.us.lot.javaday4;

/*
  @author : welcome-to-hell
  @since : 2021-01-15
*/
public class Teacher {

    //properties
    private String firstName;
    private String middleName;
    private String lastName;
    private String contactNumber;

    public Teacher() {
        System.out.println("default");
    }

    public Teacher(String firstName, String middleName, String lastName, String contactNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;

    }

    public Teacher(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Teacher(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
