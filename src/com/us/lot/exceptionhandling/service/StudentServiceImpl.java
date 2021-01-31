package com.us.lot.exceptionhandling.service;

import com.us.lot.exceptionhandling.customException.StudentNotFoundException;
import com.us.lot.exceptionhandling.entity.Student;

/*
  @author : Chandra Khadka
  @since : 2021-01-27
*/
public class StudentServiceImpl implements StudentService {

    @Override
    public Student findByName(String name) throws StudentNotFoundException{
        //database ---student details

        //business logic..
        if (name.equals("Rimesh")) {
            return new Student("Rimesh", 21);
        } else {
            throw new StudentNotFoundException("Student not found!");
        }


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
//        return null;
    }
}
