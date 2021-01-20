package com.us.lot.abstraction;

/*
  @author : Chandra Khadka
  @since : 2021-01-20
*/
public class Teacher extends Person {

    private String empId;

    public Teacher(){
    }

    public Teacher(String empId, String name, Integer age, String gender) {
        super(name, age, gender);
        this.empId = empId;
    }

    public void setEmpId(String empId){
        this.empId = empId;
    }

    public String getEmpId(){
        return empId;
    }

}
