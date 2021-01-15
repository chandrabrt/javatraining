package com.us.lot.javaday4;

/*
  @author : welcome-to-hell
  @since : 2021-01-15
*/
//POJO Class
public class Student {

    //properties
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String contactNumber;
    private String semester;
    private Integer age;

    //setter -- to set firstName to the object(Student)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //get FirstName
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFullName(){

        if (middleName == null){
            return firstName + " " + lastName;
        }
        return firstName + " "+ middleName + " "+ lastName;
    }
}
