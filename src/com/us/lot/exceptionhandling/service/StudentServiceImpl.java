package com.us.lot.exceptionhandling.service;

import com.us.lot.exceptionhandling.customException.StudentNotFoundException;
import com.us.lot.exceptionhandling.entity.Student;

/*
  @author : Chandra Khadka
  @since : 2021-01-27
*/
public class StudentServiceImpl implements StudentService {

    @Override
    public Student findByName(String name) {
        //database ---student details
        if (name.equals("Rimesh")) {
            return new Student("Rimesh", 21);
        } else {
            ///student not found logic..
            try {
                int a = 21 / 0;
                System.out.println(a);
            } catch (ArithmeticException exception) {
                throw new StudentNotFoundException("ES-001", "Student not found");
            }
        }
        return null;
    }
}
