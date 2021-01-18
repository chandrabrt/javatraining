package com.us.lot.inheritance;

/*
  @author : Chandra Khadka
  @since : 2021-01-18
*/
public class Student extends Person{

    private Integer rollNo;

    public Student(){}

    public Student(Integer rollNo, String name, Integer age, String gender) {
        super(name, age, gender);
        this.rollNo = rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getRollNo() {
        return rollNo;
    }
}
