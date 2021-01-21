package com.us.lot.interface_example;

import com.us.lot.interface_example.entity.Student;

/*
  @author : Chandra Khadka
  @since : 2021-01-21
*/
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(21);
        Main main = new Main();
        main.saveStudentDetails(student);
    }

    public  void saveStudentDetails(Student student) {
        //saving....
        student.setAge(21);
        student.setGender("MALE");
        student.setName("Chandra");
    }

    public  void getStudentRecord(Student student) {
        System.out.println(student.getName());
    }
}
