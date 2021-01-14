package com.us.lot.javaday3.constructors;

/*
  @author : welcome-to-hell
  @since : 2021-01-14
*/
public class Employee {

    private String name;
    private String address;
    private String mobileNumber;

    public Employee() {
    }

    public Employee(String name, String address, String mobileNumber){
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    public void message(){
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
    //customize
    public String display(){
        return "name: "+ name;
    }
}
