package com.us.lot.abstraction;

/*
  @author : Chandra Khadka
  @since : 2021-01-20
*/
public class Student extends Person {

    private String rollNum;

    public Student(){

    }
    public Student(String rollNum, String name, Integer age, String gender) {
        super(name, age, gender);
        this.rollNum = rollNum;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    @Override
    public void addressDetails(){
        System.out.println("Itahari");
    }
}
