package com.us.lot.looping;

/*
  @author : Chandra Khadka
  @since : 2021-01-17
*/
//POJO(Properties) -- data set and get
public class Student {

    private String name;
    private String address;
    private Integer age;
    private Gender gender;
    private Status status = Status.INACTIVE;

    public Student(){
    }
    //constructor
    public Student(String name, String address, Integer age, Gender gender){
        this.name= name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    //getter && setter
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

}
