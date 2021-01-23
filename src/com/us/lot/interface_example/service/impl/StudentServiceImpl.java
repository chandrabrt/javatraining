package com.us.lot.interface_example.service.impl;

import com.us.lot.interface_example.entity.Student;
import com.us.lot.interface_example.service.StudentService;

/*
  @author : Chandra Khadka
  @since : 2021-01-23
*/
public class StudentServiceImpl implements StudentService {

    @Override
    public void save(Student student) {
        //business logic
        //database.....
        System.out.println("Saving student records....");
    }

    @Override
    public Student getStudentDetailByStudentName(String name) {
        //business logic
        if (name.equals("ram")){
            return new Student("ram", 21 , "MALE");
        }else {
            System.out.println("student "+ name + "not found!");
            return new Student();
        }
    }

    @Override
    public void deleteStudentByName(String name) {
        //business logic
        System.out.println("delete student record");
    }

    @Override
    public Integer getStudentRollNumberByName(String name) {
        //business logic
        System.out.println("get student roll number by name");
        return 21;
    }
}
