package com.us.lot.javaday1;

/*
  @author : welcome-to-hell
  @since : 2021-01-12
*/
public class Teacher {

    private  String name;

    public Teacher(){}

    public Teacher(String name) {
        this.name = name;
    }


    /*
     * return_type method_Name(parameters){
     *    //business logic
     * }
     */

    void studentInfo(){
        Student student = new Student();
        student.information();
    }

    void teacherInfo(){
        System.out.println("Teacher name: "+ "teacher");
    }
}
