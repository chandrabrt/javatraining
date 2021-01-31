package com.us.lot.exceptionhandling.service;

import com.us.lot.exceptionhandling.customException.StudentNotFoundException;
import com.us.lot.exceptionhandling.entity.Student;

/*
  @author : Chandra Khadka
  @since : 2021-01-31
*/
public class SchoolServiceImpl implements SchoolService {

    @Override
    public Student findStudentDetailByName(String name) throws StudentNotFoundException {
        //business logic to call student Service
        StudentService studentService  = new StudentServiceImpl();

        //        try {
//            //business logic..
//            if (name.equals("Rimesh")) {
//                return new Student("Rimesh", 21);
//            }
//            throw new StudentNotFoundException("Student not found!");
//
//        } catch (StudentNotFoundException exception) {
//            System.out.println(exception.getMessage());
//        }

        return studentService.findByName(name);
    }
}
